import { Page, expect } from '@playwright/test';

/**
 * RootPage — consolidated by TestForge from executed runs.
 * Page URL: https://www.demoblaze.com/
 */
export class RootPage {
  constructor(private page: Page) {}

  async expectNavigationBarVisible() {
    await expect(this.page.locator('#narvbarx').first()).toBeVisible();
  }

  async expectPRODUCTStoreBrandLinkVisible() {
    await expect(this.page.locator('#nava').first()).toBeVisible();
  }

  async expectCATEGORIESLinkVisible() {
    await expect(this.page.locator('#cat').first()).toBeVisible();
  }

  async clickPhonesCategoryLink() {
    await this.page.locator('button:has-text("Phones"), a:has-text("Phones"), [role=button]:has-text("Phones")').first().click();
  }

  async expectPhonesCategoryLinkVisible() {
    await expect(this.page.locator('button:has-text("Phones"), a:has-text("Phones"), [role=button]:has-text("Phones")').first()).toBeVisible();
  }

  async clickLaptopsCategoryLink() {
    await this.page.locator('button:has-text("Laptops"), a:has-text("Laptops"), [role=button]:has-text("Laptops")').first().click();
  }

  async expectLaptopsCategoryLinkVisible() {
    await expect(this.page.locator('button:has-text("Laptops"), a:has-text("Laptops"), [role=button]:has-text("Laptops")').first()).toBeVisible();
  }

  async expectMonitorsCategoryLinkVisible() {
    await expect(this.page.locator('text="Monitors"').first()).toBeVisible();
  }

  async clickSamsungGalaxyS6ProductLink() {
    await this.page.locator('button:has-text("Samsung galaxy s6"), a:has-text("Samsung galaxy s6"), [role=button]:has-text("Samsung galaxy s6")').first().click();
  }

  async expectSamsungGalaxyS6ProductLinkVisible() {
    await expect(this.page.locator('button:has-text("Samsung galaxy s6"), a:has-text("Samsung galaxy s6"), [role=button]:has-text("Samsung galaxy s6")').first()).toBeVisible();
  }

  async expectLogInNavLinkVisible() {
    await expect(this.page.locator('#login2').first()).toBeVisible();
  }

  async expectSignUpNavLinkVisible() {
    await expect(this.page.locator('#signin2').first()).toBeVisible();
  }

  async clickCartNavLink() {
    await this.page.locator('#cartur').first().click();
  }

  async expectCartNavLinkVisible() {
    await expect(this.page.locator('#cartur').first()).toBeVisible();
  }

  async clickNokiaLumia1520ProductLink() {
    await this.page.locator('button:has-text("Nokia lumia 1520"), a:has-text("Nokia lumia 1520"), [role=button]:has-text("Nokia lumia 1520")').first().click();
  }

  async expectNokiaLumia1520ProductLinkVisible() {
    await expect(this.page.locator('button:has-text("Nokia lumia 1520"), a:has-text("Nokia lumia 1520"), [role=button]:has-text("Nokia lumia 1520")').first()).toBeVisible();
  }

  async expectSonyVaioI5ProductLinkVisible() {
    await expect(this.page.locator('text="Sony vaio i5"').first()).toBeVisible();
  }

  async expectSonyVaioI7ProductLinkVisible() {
    await expect(this.page.locator('text="Sony vaio i7"').first()).toBeVisible();
  }

  async expectPreviousPaginationButtonVisible() {
    await expect(this.page.locator('#prev2').first()).toBeVisible();
  }

  async clickNextPaginationButton() {
    await this.page.locator('#next2').first().click();
  }

  async expectNextPaginationButtonVisible() {
    await expect(this.page.locator('#next2').first()).toBeVisible();
  }

  async expectProductListingContainerVisible() {
    await expect(this.page.locator('#tbodyid').first()).toBeVisible();
  }

  async expectContactNavLinkVisible() {
    await expect(this.page.locator('text="Contact"').first()).toBeVisible();
  }

}
