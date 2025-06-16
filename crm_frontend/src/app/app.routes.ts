import { Routes } from '@angular/router';
import { HeaderComponent } from './user/header/header.component';
import { UserdetailsComponent } from './user/userdetails/userdetails.component';

export const routes: Routes = [
    { path: "customer", component:HeaderComponent,
        children: [
            { path: "", component: UserdetailsComponent}
        ]
    }
];
