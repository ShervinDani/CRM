import { Routes } from '@angular/router';
import { HeaderComponent } from './user/header/header.component';
import { UserdetailsComponent } from './user/userdetails/userdetails.component';
import { RechargeComponent } from './user/recharge/recharge.component';
import { PaymentComponent } from './user/payment/payment.component';

export const routes: Routes = [
    { path: "customer", component:HeaderComponent,
        children: [
            { path: "", component: UserdetailsComponent },
            { path: "recharge", component: RechargeComponent},
            { path: "payment", component: PaymentComponent}
        ]
    }
];
