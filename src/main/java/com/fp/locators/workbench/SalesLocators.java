package com.fp.locators.workbench;


import org.openqa.selenium.By;

public class SalesLocators {

    // Home
    public static By Home_WB_Logo = By.cssSelector("div[id='nav-container'] a[class=navbar-brand] img");
    public static By Home_WE_Search = By.id("searchTextbox");
    public static By Home_WL_NewLead = By.cssSelector("div[id='nav-container'] li[data-text='New Lead']");
    public static By Home_WL_Compliance = By.cssSelector("div[id='nav-container'] li[data-text='Compliance'] span");
    public static By Home_WL_Fulfillment = By.cssSelector("div[id='nav-container'] li[data-text='Fulfillment'] span");
    public static By Home_WL_Admin = By.cssSelector("div[id='nav-container'] li[data-text='Admin'] span");
    public static By Home_WL_Help = By.id("a[id='navbar-help'] span");
    public static By Home_WE_PipelineBeginDate = By.xpath("//*[@id='rangeContainer']/form/input");
    public static By Home_WL_PipelineEndDate = By.id("//*[@id='page-content-wrapper']/div/div/sales-home/div/div[2]/pipeline/div[2]/div[2]/form/input");
    public static By Home_WL_Apply = By.xpath("//*[@id='page-content-wrapper']/div/div/sales-home/div/div[2]/pipeline/div[2]/div[3]/button");
    public static By Home_WL_DailySales = By.xpath("//*[@id='page-content-wrapper']/div/div/sales-home/div/div[1]/key-stats/div[2]/div[1]/span");
    public static By Home_WL_WeeklySales = By.xpath("//*[@id='page-content-wrapper']/div/div/sales-home/div/div[1]/key-stats/div[2]/div[2]/span");
    public static By Home_WL_MonthlySales = By.xpath("//*[@id='page-content-wrapper']/div/div/sales-home/div/div[1]/key-stats/div[2]/div[3]/span");
    public static By Home_WL_MTDAvgCoupon = By.xpath("//*[@id='page-content-wrapper']/div/div/sales-home/div/div[1]/key-stats/div[3]/div[1]/span");
    public static By Home_WL_MTDCloseRate = By.xpath("//*[@id='page-content-wrapper']/div/div/sales-home/div/div[1]/key-stats/div[3]/div[2]/span");
    public static By Home_WL_MTDPoints = By.xpath("//*[@id='page-content-wrapper']/div/div/sales-home/div/div[1]/key-stats/div[3]/div[3]/span");
    public static By Home_WL_MTDIMUM = By.xpath("//*[@id='page-content-wrapper']/div/div/sales-home/div/div[1]/key-stats/div[4]/div[1]/span");
    public static By Home_WL_MTDACH = By.xpath("//*[@id='page-content-wrapper']/div/div/sales-home/div/div[1]/key-stats/div[4]/div[2]/span");
    public static By Home_WL_MTDQolsys = By.xpath("//*[@id='page-content-wrapper']/div/div/sales-home/div/div[1]/key-stats/div[4]/div[3]/span");
    public static By Home_WL_ = By.id("");

    //Quick Note (QN)
    public static By QN_WE_NoteText = By.id("NoteText");
    public static By QN_WB_AddNote = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[2]/div[1]/sidebar/div[3]/sidebar-quick-note/div/button");

    //Send Quote (SQ)
    public static By SQ_WE_Email = By.id("Email");
    public static By SQ_WB_SendQuote = By.id("btn-saveCallback");
    public static By SQ_WB_Cancel = By.id("btn-cancel");

    //Send Contract (SC)
    public static By SC_WE_Email = By.id("Email");
    public static By SC_WB_SendContract = By.id("btn-saveCallback");
    public static By SC_WB_Cancel = By.name("btn-cancel");

    //Search Results (SR)
    public static By SR_WE_ResultsFor = By.xpath("//*[@id='search-results-container']/h1");
    public static By SR_WE_AccountCount = By.xpath("//*[@id='search-results-container']/div[1]/h2");
    public static By SR_WE_LeadCount = By.xpath("//*[@id='search-results-container']/div[2]/h2");

    //Interaction Summary (IS)
    public static By IS_WB_InteractionSummary = By.id("salesInteractionSummaryOpenClose");
    public static By IS_WB_All = By.xpath("//*[@id='tabContainer']/ul/li[1]/a");
    public static By IS_WB_Dials = By.xpath("//*[@id='tabContainer']/ul/li[2]/a");
    public static By IS_WB_Contacts = By.xpath("//*[@id='tabContainer']/ul/li[3]/a");
    public static By IS_WB_Emails = By.xpath("//*[@id='tabContainer']/ul/li[4]/a");
    public static By IS_WB_Websites = By.xpath("//*[@id='tabContainer']/ul/li[5]/a");
    public static By IS_WB_Notes = By.xpath("//*[@id='tabContainer']/ul/li[6]/a");

    //Actions (Actn)
    public static By Actn_WB_Actions = By.id("single-button");
    public static By Actn_WB_SendEmail = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[1]/action-menu/div/ul/li[1]/a");
    public static By Actn_WB_CallbackSchedule = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[1]/action-menu/div/ul/li[2]/a");
    public static By Actn_WB_DisposeLead = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[1]/action-menu/div/ul/li[3]/a");
    public static By Actn_WB_SourceHistory = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[1]/action-menu/div/ul/li[4]/a");
    public static By Actn_WB_FriendReferral = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[1]/action-menu/div/ul/li[5]/a");
    public static By Actn_WB_CheckNetworkCoverage = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[1]/action-menu/div/ul/li[6]/a");
    public static By Actn_WB_AddNote = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[1]/action-menu/div/ul/li[7]/a");
    public static By Actn_WB_UnsubscribeEmail = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[1]/action-menu/div/ul/li[8]/a");
    public static By Actn_WB_ChangeCallbackPermission = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[1]/action-menu/div/ul/li[9]/a");

    //Send Email (SE)
    public static By SE_WS_CallFollowUpToLead = By.xpath("//*[@id='sendEmailForm']/div[2]/div[1]/div[1]/div/ul/li[1]/input");
    public static By SE_WS_DIY = By.xpath("//*[@id='sendEmailForm']/div[2]/div[1]/div[1]/div/ul/li[2]/input");
    public static By SE_WS_Renters = By.xpath("//*[@id='sendEmailForm']/div[2]/div[1]/div[1]/div/ul/li[3]/input");
    public static By SE_WS_Wireless = By.xpath("//*[@id='sendEmailForm']/div[2]/div[1]/div[1]/div/ul/li[4]/input");
    public static By SE_WS_ReviewComparison = By.xpath("//*[@id='sendEmailForm']/div[2]/div[1]/div[1]/div/ul/li[5]/input");
    public static By SE_WS_CallAttemptFirst = By.xpath("//*[@id='sendEmailForm']/div[2]/div[1]/div[2]/div/ul/li[1]/input");
    public static By SE_WS_CallAttemptFinal = By.xpath("//*[@id='sendEmailForm']/div[2]/div[1]/div[2]/div/ul/li[2]/input");
    public static By SE_WS_ReferAFriend = By.xpath("//*[@id='sendEmailForm']/div[2]/div[1]/div[2]/div/ul/li[3]/input");
    public static By SE_WS_SalesFollowUp = By.xpath("//*[@id='sendEmailForm']/div[2]/div[1]/div[2]/div/ul/li[4]/input");
    public static By SE_WS_SupportRAF = By.xpath("//*[@id='sendEmailForm']/div[2]/div[1]/div[2]/div/ul/li[5]/input");
    public static By SE_WS_SalesWeeklyPromo = By.xpath("//*[@id='sendEmailForm']/div[2]/div[1]/div[2]/div/ul/li[6]/input");
    public static By SE_WE_EmailID = By.id("Email");
    public static By SE_WB_SendCustomEmail = By.id("btn-sendCustom");
    public static By SE_WB_SendCannedEmail = By.id("btn-send");
    public static By SE_WB_Cancel = By.id("btn-cancel");
    public static By SE_WB_Close = By.xpath("//*[@id='sendEmailForm']/div[1]/button");

    //Call back Schedule (CBS)
    public static By CBS_WE_Message = By.id("Message");
    public static By CBS_WE_StartDate = By.id("StartDate");
    //	public static By CBS_WT_DPMonthYear = By.xpath("//*[@id='ui-datepicker-div']/div[1]/div");
//	public static By CBS_WT_DPMonth = By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/span[1]");
//	public static By CBS_WT_DPYear = By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/span[2]");
//	public static By CBS_WB_DPNextMonth = By.xpath("//*[@id='ui-datepicker-div']/div[1]/a[2]/span");
//	public static By CBS_WB_DPPrevMonth = By.xpath("//*[@id='ui-datepicker-div']/div[1]/a[1]/span");
//	public static By CBS_WT_DPDates = By.xpath("//*[@id='ui-datepicker-div']/table/tbody");
//	public static By CBS_WT_DPTime = By.id("ui_tpicker_time_StartDate");
    public static By CBS_WB_DPHour = By.xpath("//*[@id='callbackScheduleContainer']/div[2]/form/div[2]/div/table/tbody/tr[2]/td[1]/input");
    public static By CBS_WB_DPMinutes = By.id("//*[@id='callbackScheduleContainer']/div[2]/form/div[2]/div/table/tbody/tr[2]/td[3]/input");
    public static By CBS_WB_DPMeridian = By.id("//*[@id='callbackScheduleContainer']/div[2]/form/div[2]/div/table/tbody/tr[2]/td[4]/button");
    //	public static By CBS_WB_DPNow = By.xpath("//*[@id='ui-datepicker-div']/div[3]/button[1]");
//	public static By CBS_WB_DPDone = By.xpath("//*[@id='ui-datepicker-div']/div[3]/button[2]");
    public static By CBS_WL_AssignedTo = By.id("AssignedTo");
    public static By CBS_WL_SalesRep = By.id("SalesRep");
    public static By CBS_WS_CategoryHot = By.xpath("//*[@id='callbackScheduleContainer']/div[2]/form/div[4]/div/div[1]/input");
    public static By CBS_WS_CategoryWarm = By.xpath("//*[@id='callbackScheduleContainer']/div[2]/form/div[4]/div/div[2]/input");
    public static By CBS_WS_CategoryCold = By.id("//*[@id='callbackScheduleContainer']/div[2]/form/div[4]/div/div[3]/input");
    public static By CBS_WL_PhoneType = By.id("PhoneType");
    public static By CBS_WL_PhoneNum = By.id("Phone");
    public static By CBS_WL_Save = By.id("btn-saveCallback");
    public static By CBS_WL_Cancel = By.name("btn-cancel");

    //Dispose Lead (DL)
    public static By DL_WS_NotInterested = By.xpath("//*[@id='disposeLeadForm']/div[1]/div/div[1]/label/input");
    public static By DL_WS_NoMessage = By.xpath("//*[@id='disposeLeadForm']/div[1]/div/div[2]/label/input");
    public static By DL_WS_Budget = By.xpath("//*[@id='disposeLeadForm']/div[1]/div/div[3]/label/input");
    public static By DL_WS_LeftMessage = By.xpath("//*[@id='disposeLeadForm']/div[1]/div/div[4]/label/input");
    public static By DL_WS_Competition = By.xpath("//*[@id='disposeLeadForm']/div[1]/div/div[5]/label/input");
    public static By DL_WS_ScrubLead = By.xpath("//*[@id='disposeLeadForm']/div[1]/div/div[6]/label/input");
    public static By DL_WS_DoNotCall = By.xpath("//*[@id='disposeLeadForm']/div[1]/div/div[7]/label/input");
    public static By DL_WS_Reworking = By.xpath("//*[@id='disposeLeadForm']/div[1]/div/div[8]/label/input");
    public static By DL_WS_Rework = By.xpath("//*[@id='disposeLeadForm']/div[1]/div/div[9]/label/input");
    public static By DL_WE_Note = By.id("Note");
    public static By DL_WL_CompetitionName = By.id("CompetitionName");
    public static By DL_WL_CompetitionOther = By.id("OtherCompetition");
    public static By DL_WB_Save = By.id("disposebtn-save");
    public static By DL_WB_Cancel = By.id("btn-cancel");

    //Friend Referral (FR)
    public static By FR_WE_ARNumber = By.id("ARNumber");
    public static By FR_WE_Lookup = By.id("loadFriendReferral");
    public static By FR_WT_Name = By.xpath("/html/body/div[3]/div/div/div[2]/form/div[2]/div[2]");
    public static By FR_WT_Location = By.xpath("/html/body/div[3]/div/div/div[2]/form/div[3]/div[2]");
    public static By FR_WT_CustomerSince = By.xpath("/html/body/div[3]/div/div/div[2]/form/div[4]/div[2]");
    public static By FR_WE_Note = By.id("Note");
    public static By FR_WE_AdtnlSystem = By.id("IsAdditionalSystem");
    public static By FR_WE_SaveReferral = By.id("btn-saveFriendReferral");
    public static By FR_WE_Cancel = By.id("btn-cancel");

    //Check Network Coverage (CNC)
    public static By CNC_WE_Address1 = By.id("CheckCoverageAddress.Address1");
    public static By CNC_WE_Address2 = By.id("CheckCoverageAddress.Address2");
    public static By CNC_WE_ZipCode = By.id("CheckCoverageAddress.Zip");
    public static By CNC_WE_City = By.id("CheckCoverageAddress.City");
    public static By CNC_WE_State = By.id("state");
    public static By CNC_WE_CheckCoverage = By.id("btnCheckCoverage");
    public static By CNC_WE_Cancel = By.id("btnCancelCheckCoverage");

    //Add New Note (ANN)
    public static By ANN_WE_Primary = By.id("PrimaryNoteTypeId");
    public static By ANN_WE_Secondary = By.id("SecondaryNoteTypeId");
    public static By ANN_WE_Note = By.id("NoteText");
    public static By ANN_WB_Save = By.id("btnPopNoteSave");
    public static By ANN_WB_Cancel = By.id("btnNoteClear");

    //Unsubscribe Email (UE)
    public static By UE_WE_Email = By.id("Email");
    public static By UE_WE_Unsubscribe = By.id("btn-saveUnsubscribe");
    public static By UE_WE_Cancel = By.id("btn-cancel");

    //Permission to Callback (PC)
    public static By PC_WE_CurrentPermission = By.id("//*[@id='tcpaForm']/div[2]/div/div/div/text()");
    public static By PC_WE_Granted = By.id("btn-grant");
    public static By PC_WE_Denied = By.id("btn-deny");
    public static By PC_WE_Cancel = By.id("btn-cancel");

    //Create a New Lead (CNL)
    public static By CNL_WB_LeadTab = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[1]/lead-navigation/button[1]");
    public static By CNL_WL_LeadSource = By.id("leadSource");
    public static By CNL_WE_DNIS = By.id("dnis");
    public static By CNL_WE_FirstName = By.id("firstName");
    public static By CNL_WE_LastName = By.id("lastName");
    public static By CNL_WE_Phone = By.id("phone");
    public static By CNL_WE_Email = By.id("email");
    public static By CNL_WE_CompanyName = By.id("companyName");
    public static By CNL_WE_SubId = By.id("subId");
    public static By CNL_WS_PropertyTypeResidential = By.xpath("//*[@id='showLeadForm']/edit-lead-contact/div[2]/fieldset/div[1]/div/input[1]");
    public static By CNL_WS_PropertyTypeBusiness = By.xpath("//*[@id='showLeadForm']/edit-lead-contact/div[2]/fieldset/div[1]/div/input[2]");
    public static By CNL_WE_Address1 = By.id("line1");
    public static By CNL_WE_Address2 = By.id("line2");
    public static By CNL_WE_Zip = By.id("zipCode");
    public static By CNL_WE_City = By.id("city");
    public static By CNL_WL_State = By.id("state");
    public static By CNL_WB_Save = By.id("btn-save-new-lead");
    public static By CNL_WB_Cancel = By.id("btn-cancel-new-lead");
    public static By CNL_WL_ = By.id("");

    //Confirm TCPA permission
    public static By CNL_WB_Yes = By.cssSelector("div[id='confirmMessageContainer'] button[class='btn btn-primary pull-left']");
    public static By CNL_WB_No = By.cssSelector("div[id='confirmMessageContainer'] button[class='btn btn-default pull-left']");

    //Create Quote (CQ)
    public static By CQ_WB_QuoteTab = By.id("tab-quote");
    public static By CQ_WT_LeadName = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[2]/div[1]/sidebar/div[1]/sidebar-lead-summary/div/h4");
    public static By CQ_WT_Email = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[2]/div[1]/sidebar/div[1]/sidebar-lead-summary/div/div[1]/a");
    public static By CQ_WT_Phone = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[2]/div[1]/sidebar/div[1]/sidebar-lead-summary/div/div[2]/a");
    public static By CQ_WT_Source = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[2]/div[1]/sidebar/div[1]/sidebar-lead-summary/div/div[3]/text()");
    public static By CQ_WT_Status = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[2]/div[1]/sidebar/div[1]/sidebar-lead-summary/div/div[4]/text()");
    public static By CQ_WT_LeadID = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[2]/div[1]/sidebar/div[1]/sidebar-lead-summary/div/div[5]/text()");
    public static By CQ_WT_RecentActivity = By.id("last-three-notes-container");
    public static By CQ_WE_NoteText = By.xpath("NoteText");
    public static By CQ_WB_AddNote = By.xpath("sidebar-add-note");
    /*	public static By CQ_WT_Shipping = By.cssSelector("div[id='shippingInfoDiv'] span");
        public static By CQ_WS_FreeShipping = By.cssSelector("input[id='freeShipping']");
        public static By CQ_WT_Plan = By.cssSelector("div[id='planCodeDiv'] span");
        public static By CQ_WT_Contract = By.cssSelector("div[id='contractInfoDiv'] span");
        public static By CQ_WT_Total = By.xpath("//*[@id='quoteForm']/quote-info/div/div[2]/h2/span");
        public static By CQ_WT_SubTotal = By.xpath("//*[@id='quoteForm']/quote-info/div/div[2]/h4/span");
        public static By CQ_WT_ShippingCost = By.xpath("//*[@id='quoteForm']/quote-info/div/div[2]/div[1]/div[2]");
        public static By CQ_WT_CouponDiscount = By.xpath("//*[@id='quoteForm']/quote-info/div/div[2]/div[2]/div[2]");
        public static By CQ_WT_ContractDiscount = By.xpath("//*[@id='quoteForm']/quote-info/div/div[2]/div[3]/div[2]");
        public static By CQ_WT_EstimatedSalesTax = By.xpath("//*[@id='quoteForm']/quote-info/div/div[2]/div[4]/div[2]");*/
    public static By CQ_WL_QuoteProductList = By.cssSelector("div[id='quote-list'] quote-product[product='product']");
    public static By CQ_WL_Qualification = By.id("qualificationList");
    public static By CQ_WB_Discount = By.id("discountAmount-quote");
    public static By CQ_WB_SendQuote = By.id("//*[@id='quoteForm']/quote-footer/div/div/div[2]/button[2]");
    public static By CQ_WE_SendContract = By.id("//*[@id='quoteForm']/quote-footer/div/div/div[2]/button[3]");
    public static By CQ_WB_New = By.id("//*[@id='quoteForm']/quote-footer/div/div/div[2]/button[4]");
    public static By CQ_WB_Save = By.id("save-quote");
    public static By CQ_WB_Order = By.id("order-quote");
    public static By CQ_WM_ConfirmMessage = By.id("confirmMessageContainer");
    public static By CQ_WB_ConfirmOK = By.cssSelector("div[id='confirmMessageContainer'] button[class='btn btn-primary ']");
    public static By CQ_WB_ConfirmCancel = By.cssSelector("div[id='confirmMessageContainer'] button[class='btn btn-default ']");
    public static By CQ_WM_ErrorMessage = By.id("errorMessageContainer");
    public static By CQ_WB_ErrorOK = By.cssSelector("div[id='errorMessageContainer'] button[class='btn btn-primary ']");
    /*	public static By CQ_WM_ShippingModal = By.id("quoteShippingModalContainer");
        public static By CQ_WS_ShippingMethods = By.cssSelector("div[ng-repeat^='shippingType']");
        public static By CQ_WM_PlanModal = By.id("quotePlanModalContainer");
        public static By CQ_WS_PlanTypes = By.cssSelector("div.modal-body div.row");
        public static By CQ_WM_ContractModal = By.id("quoteContractModalContainer");
        public static By CQ_WS_ContractTypes = By.cssSelector("div[ng-repeat^='contractType']");*/
    public static By CQ_WB_ShippingGround = By.xpath("//*[@id='quoteForm']//label[@ng-model='$ctrl.shippingType'][contains(text(),'Ground')]");
    public static By CQ_WB_Shipping2Day = By.xpath("//*[@id='quoteForm']//label[@ng-model='$ctrl.shippingType'][contains(text(),'2-Day')]");
    public static By CQ_WB_ShippingOvernight = By.xpath("//*[@id='quoteForm']//label[@ng-model='$ctrl.shippingType'][contains(text(),'Overnight')]");
    public static By CQ_WB_ShippingSaturday = By.xpath("//*[@id='quoteForm']//label[@ng-model='$ctrl.shippingType'][contains(text(),'Saturday')]");
    public static By CQ_WB_FreeShipYes = By.xpath("//*[@id='quoteForm']//label[@ng-model='$ctrl.freeShipping'][contains(text(),'Yes')]");
    public static By CQ_WB_FreeShipNo = By.xpath("//*[@id='quoteForm']//label[@ng-model='$ctrl.freeShipping'][contains(text(),'No')]");
    public static By CQ_WB_Contract1Year = By.xpath("//*[@id='quoteForm']//label[@ng-model='$ctrl.contractTerm'][contains(text(),'1-Year')]");
    public static By CQ_WB_Contract3Year = By.xpath("//*[@id='quoteForm']//label[@ng-model='$ctrl.contractTerm'][contains(text(),'3-Year')]");
    public static By CQ_WB_PlanUM = By.xpath("//*[@id='quoteForm']//label[@ng-model='$ctrl.monitoringPlan'][contains(text(),'UM')]");
    public static By CQ_WB_PlanIM = By.xpath("//*[@id='quoteForm']//label[@ng-model='$ctrl.monitoringPlan'][contains(text(),'IM')]");
    public static By CQ_WB_PlanPM = By.xpath("//*[@id='quoteForm']//label[@ng-model='$ctrl.monitoringPlan'][contains(text(),'PM')]");
    public static By CQ_WB_RFTPTerm30 = By.xpath("//*[@id='quoteForm']//label[@ng-model='$ctrl.quote.RftpTerm'][contains(text(),'30')]");
    public static By CQ_WB_RFTPTerm45 = By.xpath("//*[@id='quoteForm']//label[@ng-model='$ctrl.quote.RftpTerm'][contains(text(),'45')]");
    public static By CQ_WB_RFTPTerm60 = By.xpath("//*[@id='quoteForm']//label[@ng-model='$ctrl.quote.RftpTerm'][contains(text(),'60')]");
    public static By CQ_WT_EstimatedShipping = By.xpath("//label[contains(text(),'Estimated Shipping')]/following-sibling::div/span");
    public static By CQ_WT_FreeShipping = By.xpath("//label[contains(text(),'Free Shipping')]/following-sibling::div/span");
    public static By CQ_WT_TotalEquipmentCost = By.xpath("//label[contains(text(),'Equipment Total:')]/following-sibling::div");
    public static By CQ_WE_AdditionalDiscount = By.xpath("//label[contains(text(),\"Add'l Discount:\")]/following-sibling::div/input");
    public static By CQ_WT_SubTotal = By.xpath("//label[contains(text(),'SubTotal:')]/following-sibling::div");
    public static By CQ_WT_EstimatedSalesTax = By.xpath("//label[contains(text(),'Est. Sales Tax:')]/following-sibling::div");
    public static By CQ_WT_ContractDiscount = By.xpath("//label[contains(text(),'Contract Discount:')]/following-sibling::div");
    public static By CQ_WT_Total = By.xpath("//label[contains(text(),'Total')]/following-sibling::div/span");
    public static By CQ_WT_MonthlyRMR = By.xpath("//label[contains(text(),'Monthly')]/following-sibling::div/span");


    //Discount (Dis)
    public static By Dis_WL_CouponType = By.id("couponList");
    //public static By Dis_WE_DiscountAmount = By.id("formattedDiscountAmount");
    //public static By Dis_WT_ADCDiscountAmount = By.xpath("//*[@id='quoteDiscountModal']/div[2]/form/div[2]/ul/li[1]");
    public static By Dis_WE_DiscretionaryDiscount = By.id("discountAmount");
    public static By Dis_WS_DiscountReason = By.id("discountReason");
    public static By Dis_WS_DiscRsnExpln = By.id("discountReasonExplanation");
    public static By Dis_WE_TotalDiscount = By.xpath("//label[contains(text(),'Total Discount:')]/following-sibling::div[1]/p");
    public static By Dis_WE_Total = By.xpath("//label[contains(text(),'Total:')]/following-sibling::div[1]/p");
    public static By Dis_WA_ValidationMsg = By.cssSelector("#validationMessages div");
    //public static By Dis_WT_GrandTotal = By.cssSelector("div[id='quoteDiscountModal'] h3.ng-binding");
    public static By Dis_WB_ApplyDiscount = By.xpath("//button[contains(text(),'Apply Discount')]");
    public static By Dis_WB_Cancel = By.xpath("//button[contains(text(),'Cancel')]");
    public static By Dis_WB_Close = By.cssSelector("button[class='close'] span");

    //Qualify (Qal)
    public static By Qal_WL_Qualify = By.id("tab-qualify");
    public static By Qal_WS_Individual = By.cssSelector("input[type='radio'][value='Individual']");
    public static By Qal_WS_Business = By.cssSelector("input[type='radio'][value='Business']");
    public static By Qal_WE_FirstName = By.id("FirstName");
    public static By Qal_WE_LastName = By.id("LastName");
    public static By Qal_WE_CompanyName = By.id("CompanyName");
    public static By Qal_WE_Address1 = By.id("Address1");
    public static By Qal_WE_Address2 = By.id("Address2");
    public static By Qal_WE_Zipcode = By.id("PostalCode");
    public static By Qal_WE_City = By.id("City");
    public static By Qal_WL_State = By.id("state");
    public static By Qal_WS_Owner = By.cssSelector("input[type='radio'][value='Owner']");
    public static By Qal_WS_Renter = By.cssSelector("input[type='radio'][value='Renter']");
    public static By Qal_WE_SSN = By.id("Ssn");
    public static By Qal_WE_DOB = By.id("DoB");
    public static By Qal_WE_LastQlfDate = By.cssSelector("existing-qualifications > div > div:nth-child(1) > div.col-xs-7 > span");
    public static By Qal_WE_GoodUntil = By.cssSelector("existing-qualifications > div > div:nth-child(2) > div.col-xs-7 > span");
    public static By Qal_WE_RunQualification = By.id("run-qualifications");
    public static By Qal_WE_HardInquiry = By.id("hard-inquiry");
    public static By Qal_WE_Override = By.id("override");

    //Override (QalO)
    //public static By QalO_WE_UserName = By.id("Username");
    //public static By QalO_WE_Password = By.id("Password");
    public static By QalO_WS_OverrideReason = By.id("OverrideDelayReason");
    public static By QalO_WE_CreditScore = By.id("Score");
    public static By QalO_WE_Explanation = By.id("Explanation");
    public static By QalO_WE_FollowUpDate = By.id("CallbackDate");
    public static By QalO_WE_FollowUpTimeHours = By.cssSelector("table[class='uib-timepicker'] input[placeholder='HH']");
    public static By QalO_WE_FollowUpTimeMinutes = By.cssSelector("table[class='uib-timepicker'] input[placeholder='MM']");
    public static By QalO_WE_FollowUpTimeMeridian = By.cssSelector("table[class='uib-timepicker'] td[class='uib-time am-pm'] button");
    public static By QalO_WE_ResponsibleRep = By.id("OverrideFollowupRep");
    public static By QalO_WE_AuthorizeOverride = By.cssSelector("#overrideModal button[class*='btn-primary']");
    public static By QalO_WE_Cancel = By.xpath("//button[contains(text(),'Cancel')]");

    //Order (Ord)
    public static By Ord_WE_PassCode = By.name("PassCode");
    public static By Ord_WE_InitialUserCode = By.name("UserCode");
    public static By Ord_WE_FirstName = By.name("ContactInformationFirstName");
    public static By Ord_WE_LastName = By.name("ContactInformationLastName");
    public static By Ord_WE_Phone = By.name("ContactInformationPhone");
    public static By Ord_WE_AltPhone = By.name("ContactInformationAltPhone");
    public static By Ord_WE_Email = By.name("ContactInformationEmail");
    public static By Ord_WE_AltEmail = By.name("ContractInformationAltEmail");
    public static By Ord_WE_PremisesAddress1 = By.name("PremisesAddressAddress1");
    public static By Ord_WE_PremisesAddress2 = By.cssSelector("input[ng-model='order.PremisesAddress.Line2']");
    public static By Ord_WE_PremisesZipcode = By.name("PremisesAddressPostalCode");
    public static By Ord_WE_PremisesCity = By.name("PremisesAddressCity");
    public static By Ord_WL_PremisesState = By.id("state");
    public static By Ord_WS_SameAsPremises = By.cssSelector("input[ng-model='order.ShippingAddressUsePremisesAddress']");
    public static By Ord_WE_ShippingAttention = By.name("ShippingAddressAttention");
    public static By Ord_WE_ShippingAddress1 = By.name("ShippingAddressAddress1");
    public static By Ord_WE_ShippingAddress2 = By.cssSelector("input[ng-model='order.ShippingAddress.Line2']");
    public static By Ord_WE_ShippingZipcode = By.name("ShippingAddressPostalCode");
    public static By Ord_WE_ShippingCity = By.name("ShippingAddressCity");
    public static By Ord_WL_ShippingState = By.cssSelector("states-dropdown[model='order.ShippingAddress.State'] #state");
    public static By Ord_WS_UsePremises = By.cssSelector("input[ng-model='order.PaymentAddressUsePremisesAddress']");
    public static By Ord_WE_PaymentFirstName = By.name("InitialPaymentFirstName");
    public static By Ord_WE_PaymentLastName = By.name("InitialPaymentLastName");
    public static By Ord_WE_PaymentAddress1 = By.name("InitialPaymentAddress1");
    public static By Ord_WE_PaymentZipcode = By.name("InitialPaymentPostalCode");
    public static By Ord_WE_PaymentCreditCard = By.name("InitialPaymentCardNumber");
    public static By Ord_WL_PaymentExpMonth = By.name("InitialPaymentExpirationMonth");
    public static By Ord_WL_PaymentExpYear = By.name("InitialPaymentExpirationYear");
    public static By Ord_WE_PaymentCVC = By.name("InitialPaymentVerificationNumber");
    public static By Ord_WS_SameAsPayment = By.cssSelector("input[ng-model='order.RecurringPaymentUseInitialPayment']");
    public static By Ord_WE_RecrPayFirstName = By.name("RecurringPaymentFirstName");
    public static By Ord_WE_RecrPayLastName = By.name("RecurringPaymentLastName");
    public static By Ord_WE_RecrPayAddress1 = By.name("RecurringPaymentAddress1");
    public static By Ord_WE_RecrPayZipcode = By.name("RecurringPaymentPostalCode");
    public static By Ord_WL_RecrPayMethod = By.cssSelector("select[ng-model='order.RecurringPayment.PaymentMethod']");
    public static By Ord_WE_RecrPayCreditCard = By.name("RecurringPaymentCardNumber");
    public static By Ord_WL_RecrPayExpMonth = By.name("RecurringPaymentExpirationMonth");
    public static By Ord_WL_RecrPayExpYear = By.name("RecurringPaymentExpirationYear");
    public static By Ord_WE_RecrPayCVC = By.name("RecurringPaymentVerification");
    public static By Ord_WE_RecrPayChecking = By.cssSelector("input[name='RecurringPaymentAccountType'][value='Checking']");
    public static By Ord_WE_RecrPaySavings = By.cssSelector("input[name='RecurringPaymentAccountType'][value='Savings']");
    public static By Ord_WE_RecrPayABA = By.name("RecurringPaymentABA");
    public static By Ord_WE_RecrPayAccount = By.name("RecurringPaymentAccountNumber");
    public static By Ord_WB_SaveChanges = By.id("save-order");
    public static By Ord_WB_ChargeFullAmount = By.id("order-charge");
    public static By Ord_WT_Qualification = By.cssSelector("order-qualify-details span strong");
    public static By Ord_WT_RMRStartDate = By.xpath("//label[contains(text(),'RMR Start Date:')]/following-sibling::span/strong");
    public static By Ord_WT_Total = By.cssSelector("order-quote-details > div:nth-child(1) span");
    public static By Ord_WT_SubTotal = By.cssSelector("order-quote-details > div:nth-child(2) span");
    public static By Ord_WT_Shipping = By.cssSelector("order-quote-details > div:nth-child(3) span");
    public static By Ord_WT_EstimatedSalesTax = By.cssSelector("order-quote-details > div:nth-child(4) span");
    public static By Ord_WT_CouponDiscount = By.cssSelector("order-quote-details > div:nth-child(5) span");
    public static By Ord_WT_ContractDiscount = By.cssSelector("order-quote-details > div:nth-child(6) span");
    public static By Ord_WB_ProcessOrder = By.cssSelector("order-confirmation-modal button.btn.btn-primary");

    //Order Confirmation (OrdC)
    public static By OrdC_WM_OrderConfirmModal = By.cssSelector(".modal-content");
    public static By OrdC_WT_SubTotal = By.xpath("//label[contains(text(),'Subtotal:')]/following-sibling::div/span/span");
    public static By OrdC_WT_Shipping = By.xpath("//label[contains(text(),'Shipping:')]/following-sibling::div/span/span");
    public static By OrdC_WT_ShippingStriked = By.xpath("//label[contains(text(),'Shipping:')]/following-sibling::div/span[contains(@class,'form-control-static strike')]");
    public static By OrdC_WT_CouponDiscount = By.xpath("//label[contains(text(),'Coupon:')]/following-sibling::div/span/span");
    public static By OrdC_WT_ContractDiscount = By.xpath("//label[contains(text(),'Contract Discount:')]/following-sibling::div/span/span");
    public static By OrdC_WT_SalesTax = By.xpath("//label[contains(text(),'Tax:')]/following-sibling::div/span/span");
    public static By OrdC_WT_Total = By.xpath("//label[contains(text(),'Total:')]/following-sibling::div/span/span");

    //Contract (Con)
    public static By Con_WT_ContractStatus = By.xpath("//*[@id='sales-contract-form']/div[1]/span");
    public static By Con_WT_ContractPrepared = By.xpath("//*[@id='salesContractForm']/div[2]/span");
    public static By Con_WT_ContractSigned = By.xpath("//*[@id='salesContractForm']/div[3]/span");
    public static By Con_WT_CompletionLink = By.xpath("//*[@id='salesContractForm']/div[4]/a");
    public static By Con_WT_Contract = By.xpath("//*[@id='salesContractForm']/div[5]/span");
    public static By Con_WT_CompletionToken = By.xpath("//*[@id='salesContractForm']/div[7]/a/span");
    public static By Con_WT_EmailedTo = By.xpath("//*[@id='salesContractForm']/div[7]/a/span");
    public static By Con_WT_LastEmailed = By.xpath("//*[@id='salesContractForm']/div[8]/span");
    public static By Con_WB_EmailContract = By.id("email-contract");
    public static By Con_WB_SendRevisedContract = By.id("send-revised");
    public static By Con_WB_ResendThankYouEmail = By.id("thank-you-email");
    public static By Con_WB_ViewAccount = By.id("view-account");
    public static By Con_WB_AddExceptionNote = By.id("add-exception-note");
    public static By Con_SendContract_Email = By.cssSelector("#unsubscribeEmailContainer #Email");
    public static By Con_SendContract_Save = By.cssSelector("#unsubscribeEmailContainer #btn-saveUnsubscribe");

    //Sidebar Info (SBI)
    public static By SBI_WT_LeadID = By.xpath("//*[@id='page-content-wrapper']/div/div/lead-wizard/div[2]/div[1]/sidebar/div[1]/sidebar-lead-summary/div/div[5]/text()");

    //Alarm Configuration Wizard (ACW)
    public static By ACW_WF_ACWModal = By.cssSelector("form[id='LeadQuestionnaireForm']");
    public static By ACW_WS_DropDowns = By.cssSelector("questionnaire-dropdown-question > select");
    public static By ACW_WS_Checkboxes = By.tagName("questionnaire-checkbox-question");
    public static By ACW_WE_NumericInputs = By.cssSelector("numeric-input-question-directive > input");
    public static By ACW_WE_TextAreas = By.cssSelector("questionnaire-textarea-question > textarea");
    public static By ACW_WB_Save = By.cssSelector("button[class='btn btn-primary pull-right']");
    public static By ACW_WB_Close = By.cssSelector("button[class='close']");




}






