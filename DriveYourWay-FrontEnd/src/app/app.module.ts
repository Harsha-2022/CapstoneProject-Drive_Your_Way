import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { ProductListComponent } from './components/product-list/product-list.component';
import { HttpClientModule } from '@angular/common/http';
import { ProductService } from './services/product.service';

import { Routes, RouterModule} from '@angular/router';
import { ProductCategoryMenuComponent } from './components/product-category-menu/product-category-menu.component';
import { SearchComponent } from './components/search/search.component';
import { ProductDetailsComponent } from './components/product-details/product-details.component';

import { CartStatusComponent } from './components/cart-status/cart-status.component';
import { CartDetailsComponent } from './components/cart-details/cart-details.component';
import { RegisterComponent } from './components/register/register.component';
import { LoginComponent } from './components/login/login.component';
import { LoginStatusComponent } from './components/login-status/login-status.component';
import { UpdateProductComponent } from './components/update-product/update-product.component';
import { RemoveProductComponent } from './components/remove-product/remove-product.component';
import { AddProductComponent } from './components/add-product/add-product.component';
import { CheckOutComponent } from './components/check-out/check-out.component';
import { CommonModule } from '@angular/common';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { SubscribeComponent } from './subscribe/subscribe.component';
import { PaymentComponent } from './payment/payment.component';
import { VerificationComponent } from './verification/verification.component';
const routes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: 'subscribe', component: SubscribeComponent},
  {path: 'payment', component: PaymentComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'checkout', component: CheckOutComponent},
  {path: 'add-product', component: AddProductComponent},
  {path: 'verification', component: VerificationComponent},
  {path: 'remove-product/:id', component: RemoveProductComponent},
  {path: 'update-product/:id', component: UpdateProductComponent},
  {path: 'cart-details', component: CartDetailsComponent},
  {path: 'products/:id', component: ProductDetailsComponent},
  {path: 'search/:keyword', component: ProductListComponent},
  {path: 'category/:id', component: ProductListComponent},
  {path: 'category', component: ProductListComponent},
  {path: 'products', component: ProductListComponent},
  {path: '', redirectTo: '/login', pathMatch: 'full'},
  {path: '**', redirectTo: '/login', pathMatch: 'full'}
];

@NgModule({
  declarations: [
    AppComponent,
    ProductListComponent,
    ProductCategoryMenuComponent,
    SearchComponent,
    ProductDetailsComponent,
    CartStatusComponent,
    CartDetailsComponent,
    RegisterComponent,
    LoginComponent,
    LoginStatusComponent,
    UpdateProductComponent,
    RemoveProductComponent,
    AddProductComponent,
    CheckOutComponent,
    SubscribeComponent,
    PaymentComponent,
    VerificationComponent
  ],
  imports: [ 
    NgbModule,
    RouterModule.forRoot(routes),
    FormsModule,
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    CommonModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }