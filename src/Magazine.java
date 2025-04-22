class Magazine extends LibraryItems implements Book {
    private String issueNumber;

    public Magazine(String title, String author, String publisher, String publishDate, String itemId, String issueNumber) {
        super(title, author, publisher, publishDate, itemId);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Issue Number: " + issueNumber);
    }

    @Override
    public void displayCitation(){
        System.out.println(author + ".(" + publishDate + "). " + title + ". " + publisher);
    }
}
