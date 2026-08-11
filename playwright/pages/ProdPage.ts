import { Page, expect } from '@playwright/test';

/**
 * ProdPage — consolidated by TestForge from executed runs.
 * Page URL: https://www.demoblaze.com/prod.html?idp_=1
 */
export class ProdPage {
  constructor(private page: Page) {}

  async expectProductNameHeadingVisible() {
    await expect(this.page.locator('h2.name').first()).toBeVisible();
  }

  async expectProductPriceElementVisible() {
    await expect(this.page.locator('h3.price-container').first()).toBeVisible();
  }

  async expectAddToCartButtonVisible() {
    await expect(this.page.locator('text="Add to cart"').first()).toBeVisible();
  }

}
