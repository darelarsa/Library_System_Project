class Novel extends LibraryItems implements Book{
    private int totalPages;

    public Novel(String title, String author, String publisher, int publishDate, int itemId, int totalPages) {
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
