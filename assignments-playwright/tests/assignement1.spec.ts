/* Assignment - 1
Steps:
1. Launch the application using the URL:
   https://parabank.parasoft.com/parabank/index.htm
2. Verify that the application logo is displayed.
3. Verify that the application caption is displayed as:
   "Experience the difference"
4. Enter an invalid username.
5. Enter an empty password.
6. Click on the Login button.
7. Verify the error message:
   "Please enter a username and password."
8. Click on the Admin Page link.
9. Select the option "soap" from the DBaaS Mode radio button.
10. Scroll to the Endpoint dropdown element.
11. Select the option "Web Service" from the dropdown.
12. Click on the Submit button.
13. Verify that the submission is successful by validating the success message.
14. Click on the Services page link.
15. Wait for the Services page to load.
16. Scroll down to the "Bookstore services" table.
17. Get the total number of rows in the Bookstore services table.
18. Get the total number of columns in the Bookstore services table.
19. Print the table data (row-wise and column-wise).
*/

import { expect, Locator, test } from "@playwright/test";

test('Complete assignment 1', async ({ page }) => {

    // Step 1: Launch the application
    await page.goto('https://parabank.parasoft.com/parabank/index.htm');
    console.log("Step 1: Application launched successfully");

    // Step 2: Verify application logo is displayed
    const logo: Locator = page.locator('[class="logo"]');
    await expect(logo).toBeVisible();
    console.log("Step 2: Application logo is visible");

    // Step 3: Verify caption text
    const caption: Locator = page.locator('p[class="caption"]');
    await expect(caption).toHaveText('Experience the difference');
    console.log("Step 3: Caption verified as 'Experience the difference'");

    // Step 4: Enter invalid username
    await page.locator('input[name="username"]').fill('invalidUser')
    console.log("Step 4: Invalid username entered");

    // Step 5: Enter empty password
    await page.locator('input[name="password"]').fill('')
    console.log("Step 5: Empty password entered");

    // Step 6: Click login button
    await page.locator('input[value="Log In"]').click();
    console.log("Step 6: Login button clicked");

    // Step 7: Verify error message
    const errorMsg: Locator = page.locator('p[class="error"]');
    await expect(errorMsg).toBeVisible();
    await expect(errorMsg).toHaveText('Please enter a username and password.')
    console.log("Step 7: Error message verified");

    // Step 8: Click Admin Page link
    await page.getByRole('link', { name: 'Admin Page' }).click();
    console.log("Step 8: Navigated to Admin Page");

    // Step 9: Select SOAP option
    getDataAccessMode(page,'soap');
    console.log("Step 9: SOAP option selected");

    // Step 10: Scroll to endpoint dropdown
    const endPoint: Locator = page.locator('#endpoint');
    await endPoint.scrollIntoViewIfNeeded();
    console.log("Step 10: Scrolled to endpoint dropdown");

    // Step 11: Select Web Service option
    const loanProviderDropdown: Locator = page.locator('select[id="loanProvider"]');
    await loanProviderDropdown.selectOption('ws');
    console.log("Step 11: Web Service option selected from dropdown");

    // Step 12: Click submit button
    await page.locator('input[value="Submit"]').click();
    console.log("Step 12: Submit button clicked");

    // Step 13: Verify success message
    const successMsg: Locator = page.locator("//b[text()='Settings saved successfully.']");
    await expect(successMsg).toBeVisible();
    console.log("Step 13: Settings saved successfully");

    // Step 14: Click Services page link
    const servicePage: Locator = page.locator('div[id="headerPanel"] > ul > li > [href="services.htm"]');
    await servicePage.click();
    console.log("Step 14: Navigated to Services page");

    // Step 15: Wait for Services page
    const serviceURL = page.url()
    expect(serviceURL).toBe('https://parabank.parasoft.com/parabank/services.htm');
    console.log("Step 15: Services page loaded successfully");

    // Step 16: Scroll to Bookstore services table
    const bookstore: Locator = page.locator("//span[text()='Bookstore services:']");
    await bookstore.scrollIntoViewIfNeeded();
    console.log("Step 16: Scrolled to Bookstore services table");

    // Step 17: Get total rows in Bookstore services table
    const bookstoreTable: Locator = page.locator("//span[text()='Bookstore services:']/following-sibling::table[1]");
    const Rows: Locator = bookstoreTable.locator("//tbody//tr");
    const allRows: number = await Rows.count();
    console.log("Step 17: Total rows in Bookstore services table =", allRows);

    // Step 18: Get total columns in Bookstore services table
    const Cols: Locator = bookstoreTable.locator("//tbody//tr[1]//td");
    const allCols: number = await Cols.count();
    console.log("Step 18: Total columns in Bookstore services table =", allCols);

    // Step 19: Print table data
    console.log("Step 19: Printing table data");

    for (let row = 1; row <= allRows; row++) {

        for (let col = 1; col <= allCols; col++) {

            const cell: Locator = page.locator(`//span[text()='Bookstore services:']/following-sibling::table[1]/tbody/tr[${row}]/td[${col}]`);
            const cellValue = await cell.textContent();

            console.log(`Row ${row} Cell ${col} value is`, cellValue);
        }
    }

});

/*
Reusable function to select a DBaaS Data Access Mode option.

Parameters:
page   -> Playwright page object
option -> value attribute of the radio button (e.g., soap, jdbc, jpa)

This function dynamically locates and selects the required radio button.
*/
async function getDataAccessMode(page:any, option:string) {
    const radioButton =  page.locator(`//input[@value="${option}"]`);
    await radioButton.click();

       console.log(`Data access mode '${option}' selected successfully`);
    
}