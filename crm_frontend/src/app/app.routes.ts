import { Routes } from '@angular/router';
import { HeaderComponent } from './user/header/header.component';
import { UserdetailsComponent } from './user/userdetails/userdetails.component';
import { RechargeComponent } from './user/recharge/recharge.component';
import { PaymentComponent } from './user/payment/payment.component';
import { ProfileComponent } from './user/profile/profile.component';
import { RetailerheaderComponent } from './retailer/retailerheader/retailerheader.component';
import { RetialerdashboardComponent } from './retailer/retialerdashboard/retialerdashboard.component';
import { RetaileraddcustomerComponent } from './retailer/retaileraddcustomer/retaileraddcustomer.component';
import { RetailerrechargeComponent } from './retailer/retailerrecharge/retailerrecharge.component';
import { RetailerpaymentComponent } from './retailer/retailerpayment/retailerpayment.component';

export const routes: Routes = [
    { path: "customer", component:HeaderComponent,
        children: [
            { path: "", component: UserdetailsComponent },
            { path: "recharge", component: RechargeComponent},
            { path: "payment", component: PaymentComponent},
            { path: "profile", component: ProfileComponent}
        ]
    },
    { path: "retailer", component: RetailerheaderComponent,
        children: [
            { path: "", component: RetialerdashboardComponent},
            { path: "recharge", component: RetailerrechargeComponent},
            { path: "addcustomer", component: RetaileraddcustomerComponent},
            { path: "payment", component: RetailerpaymentComponent}
        ]
    }
];
