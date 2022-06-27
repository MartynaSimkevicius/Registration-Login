import org.junit.jupiter.api.Test;

public class AllTests extends BaseTest {




    FindingElements Find = new FindingElements(driver);
    LoginPage Page= new LoginPage(driver);
   RegistrationPage Registration= new RegistrationPage(driver);
   LogOutPage out= new LogOutPage(driver);

    @Test
    void createAccount(){
     Find.CreateAccount();
     Registration.Activation();
     Registration.YorName("Bandymas1");
     Registration.Password("Bandymas1999");
     Registration.PasswordReapeat("Bandymas1999");
     Registration.Submit();
     out.Out();

    }


    @Test
    void Login(){
      //  Find.FillLoginFom();
        Page.FillSearch("Bandymas1");
        Page.FiillPasword("Bandymas1999");
        Page.ClickYes();
        out.Out();
    }




}



