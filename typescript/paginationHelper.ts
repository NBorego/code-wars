export class PaginationHelper {
  collection: Array<number | string>;
  itemsPerPage: number;

  constructor(collection: Array<number | string>, itemsPerPage: number) {
    this.collection = collection;
    this.itemsPerPage = itemsPerPage;
  }

  itemCount(): number {
    return this.collection.length;
  }

  pageCount(): number {
    const totalPages = Math.ceil(this.collection.length / this.itemsPerPage);

    return totalPages;
  }

  pageItemCount(pageIndex: number): number {
    let pages = this.collection.length;

    for (let i = 0; i < pageIndex; i++) {
      pages -= this.itemsPerPage;
    }

    return pages <= 0 ? -1 : pages;
  }

  pageIndex(itemIndex: number) {
    if (
      itemIndex < 0 ||
      itemIndex > this.collection.length ||
      this.collection.length === 0
    )
      return -1;

    const indexPage = Math.floor(itemIndex / this.itemsPerPage);

    return indexPage;
  }
}
