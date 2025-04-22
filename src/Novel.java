class Novel extends LibraryItems implements Book{
    private String totalPages;

    public Novel(String title, String author, String publisher, String publishDate, String itemId, String totalPages) {
        super(title, author, publisher, publishDate, itemId);
        this.totalPages = totalPages;
    }

    @Override
    public void displayInfo() {
        System.out.println("Total Pages: " + totalPages);
    }

    @Override
    public void displayCitation(){
        System.out.println(author + ".(" + publishDate + "). " + title + ". " + publisher);
    }
}
