package com.fp.locators.customerportal;

import org.openqa.selenium.By;

public class CpLocators {
	
	//Login page (LP)
	public static By LP_WT_UserName = By.cssSelector("#form-login [name='login-username']");
	public static By LP_WT_password = By.cssSelector("#form-login [name='login-password']");
	public static By LP_WB_Login = By.cssSelector("#form-login [type='submit']");
	public static By LP_WLI_ForgotUserName = By.cssSelector("#form-login [href='/forgotUsername']");
	public static By LP_WLI_ForgotPassword = By.cssSelector("#form-login [href='/forgotPassword']");
	
	public static By WB_Logout = By.cssSelector("#app-nav button");
	
	//LeftNav (LN)
	public static By LN_Shop_Link = By.cssSelector("#app-nav [href='/shop']");
	
	//Account settings (AS)
	public static By MenuButton = By.id("btn-menu");
	public static By AS_AccountSettingsLink = By.cssSelector("[ng-if='subMenuItem.sref'][href='/account/settings']");
	public static By AS_WLI_AccountInfo_Link = By.cssSelector("#app-page #app-header-sub [href='#account']");
	public static By AS_WLI_AccountAddresses_Link = By.cssSelector("#app-page #app-header-sub [href='#address']");
	public static By AS_WLI_AccountBilling_Link = By.cssSelector("#app-page #app-header-sub [href='#billing']");
	public static By AS_WLA_MyAccount_Label = By.cssSelector("#app-page .app-header label.main-title");
	public static By AS_WLA_AccountInfo_Label = By.cssSelector("#app-page #app-header-sub [href='#account'] span");
	public static By AS_WLA_AccountAddresses_Label = By.cssSelector("#app-page #app-header-sub [href='#address'] span");
	public static By AS_WLA_AccountBilling_Label = By.cssSelector("#app-page #app-header-sub [href='#billing'] span");
	public static By AS_AccountInfo_logo = By.cssSelector("#app-header-sub [ng-href='#account'] [ng-class='link.icon']");
	public static By AS_AccountAddresses_logo = By.cssSelector("#app-header-sub [ng-href='#address'] [ng-class='link.icon']");
	public static By AS_AccountBilling_logo = By.cssSelector("#app-header-sub [ng-href='#billing'] [ng-class='link.icon']");
	
	public static By AS_WLA_AccountInfoHeader_Label = By.cssSelector("#account h3");
	public static By AS_WLA_AccountInfoSection_Labels = By.cssSelector("#account fieldset label");
	public static By AS_WLA_AccountInfoSection_Values = By.cssSelector("#account fieldset div p");
	
	public static By AS_WLA_AccountAddressesHeader_Label = By.cssSelector("#address h3");
	public static By AS_WLA_AddressHeaders_Labels = By.cssSelector("#address fieldset h4");
	public static By AS_WLA_AddressBlocks_Labels = By.cssSelector("#address fieldset address");
	public static By AS_WLA_AccountBillingHeader_Label = By.cssSelector("#billing .section-header h3");
	public static By AS_WLA_AccountBilling_Labels = By.cssSelector("#billing fieldset label");
	public static By AS_WLA_AccountBilling_Values = By.cssSelector("#billing fieldset p");
	public static By AS_WLA_PaymentCard_Images = By.cssSelector("#billing [data-card='payment'] .payment-card");
	public static By AS_WLA_CardAutoPay_Labels = By.cssSelector("#billing .payment-card .payment-card-autopay");
	public static By AS_WLA_CardNumber_Labels = By.cssSelector("#billing .payment-card .payment-card-number");
	public static By AS_WLA_CardExpirationDate_Label = By.cssSelector("#billing .payment-card .payment-card-exp");
	public static By AS_WLA_CreditCardLogo = By.cssSelector("#billing .payment-card-type .credit-card-logo");
	public static By AS_WLA_BankAccountLogo = By.cssSelector("#billing .payment-card img:not(.credit-card-logo)");
	public static By AS_WLA_AccountBillingFeatures_Labels = By.cssSelector("#billing fieldset .features div");
	
	public static By AS_WLI_Payment_Link = By.cssSelector("#billing a[ng-click='$ctrl.openMakePaymentModal()']");
	
	public static By AS_WM_MakeAPayment_Modal = By.cssSelector("fp-make-payment-modal .modal-content");
	public static By AS_WLA_MakeAPaymentModal_Header = By.cssSelector("fp-make-payment-modal h4.modal-title");
	public static By AS_WLA_MakeAPaymentModalLeftNav_Labels = By.cssSelector("#form-payment-type label");
	public static By AS_WLA_MakeAPaymentModal_CardNumbers = By.cssSelector(".payments .payment-card .payment-card-number");
	public static By AS_WLA_MakeAPaymentModal_ExpDates = By.cssSelector(".payments .payment-card .payment-card-exp");
	public static By AS_WB_MakeAPaymentModal_NextButton = By.cssSelector(".modal-body button[type='submit']");
	
	public static By Modal_CloseButton = By.cssSelector(".modal-content button[type='button'][ng-click='$ctrl.close()']");
	
	public static By AccInfo_Edit = By.cssSelector("#account button[ng-click='$ctrl.onEdit()']");
	public static By AccInfo_Email_Edit = By.id("emailInput");
	public static By AccInfo_PrPhone_Edit = By.id("primaryPhoneInput");
	public static By AccInfo_ScPhone_Edit = By.id("secondaryPhoneInput");
	public static By AccInfo_Save = By.cssSelector("#account button[type='submit']");
	public static By AccInfo_Cancel = By.cssSelector("#account button[ng-click='$ctrl.onCancel()']");
	
	public static By AccInfo_Email_Err = By.cssSelector("#account fieldset [ng-messages='contactForm.email.$error'] li");
	public static By AccInfo_PrPh_Err = By.cssSelector("#account fieldset [ng-messages='contactForm.primaryPhone.$error'] li");
	public static By AccInfo_ScPh_Err = By.cssSelector("#account fieldset [ng-messages='contactForm.secondaryPhone.$error'] li");
	
	public static By AccAddr_Edit = By.cssSelector("#address button[ng-click='$ctrl.onEdit()']");
	public static By ShipAddr_Add1_Edit = By.id("address1InputShipping");
	public static By ShipAddr_City_Edit = By.id("cityInputShipping");
	public static By ShipAddr_Zip_Edit = By.id("zipcodeInputShipping");
	public static By AccAddr_Save = By.cssSelector("#address button[type='submit']");
	public static By AccAddr_Cancel = By.cssSelector("#address button[ng-click='$ctrl.onCancel()']");
	
	public static By ShipAddr_Add1_Err = By.cssSelector("#address fieldset [ng-messages='shippingAddressForm.address1.$error'] li");
	public static By ShipAddr_City_Err = By.cssSelector("#address fieldset [ng-messages='shippingAddressForm.city.$error'] li");
	public static By ShipAddr_Zip_Err = By.cssSelector("#address fieldset [ng-messages='shippingAddressForm.postalCode.$error'] li");
	
	public static By BillAddr_Add1_Edit = By.id("address1InputBilling");
	public static By BillAddr_City_Edit = By.id("cityInputBilling");
	public static By BillAddr_Zip_Edit = By.id("zipcodeInputBilling");
	
	public static By BillAddr_Add1_Err = By.cssSelector("#address fieldset [ng-messages='billingAddressForm.address1.$error'] li");
	public static By BillAddr_City_Err = By.cssSelector("#address fieldset [ng-messages='billingAddressForm.city.$error'] li");
	public static By BillAddr_Zip_Err = By.cssSelector("#address fieldset [ng-messages='billingAddressForm.postalCode.$error'] li");
	

}
