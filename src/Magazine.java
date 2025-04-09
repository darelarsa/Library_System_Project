class Magazine extends LibraryItems {
    private int issueNumber;

    public Magazine(String title, String author, int itemId, int issueNumber) {
        super(title, author, itemId);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue Number: " + issueNumber);
    }
}
