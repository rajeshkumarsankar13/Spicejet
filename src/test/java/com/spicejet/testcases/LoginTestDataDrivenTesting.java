package com.spicejet.testcases;


import com.spicejet.pages.BaseTest;
import com.spicejet.pages.LoginPage;
import com.spicejet.utility.ReadExcelFile;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTestDataDrivenTesting extends BaseTest {
    String fileName=System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";

    @Test(priority =1,dataProvider="LoginDataProvider")
    public void VerifyLogin(String userEmail,String userPwd) throws IOException
    {
        LoginPage lp=new LoginPage(driver);
        lp.loginToPortal(userEmail, userPwd);

    }

    @Test(priority =2)
    public void fetchDashboardText() throws IOException
    {
        LoginPage lp= PageFactory.initElements(driver,LoginPage.class);
        ReadExcelFile excel = new ReadExcelFile();
        String as= excel.getStringData("dash", 0, 0);
        System.out.println("This is excel data "+as);
        lp.dashboardportal(excel.getStringData("dash", 0, 0));
    }

    @DataProvider(name="LoginDataProvider")
    public String[][] LoginDataProvider()
    {

        int ttlRows= ReadExcelFile.getRowCount(fileName, "LoginData");
        int ttlColumns= ReadExcelFile.getColCount(fileName, "LoginData");

        String data[][]= new String[ttlRows-1][ttlColumns];

        for(int i=1;i<ttlRows;i++)
        {
            for(int j=0;j<ttlColumns;j++)
            {
                data[i-1][j]= ReadExcelFile.getCellValue(fileName, "LoginData", i, j);
            }
        }
        return data;
    }


}

