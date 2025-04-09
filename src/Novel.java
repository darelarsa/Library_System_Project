class Novel extends LibraryItems {
    private int totalPages;


    public Novel(String title, String author, int itemId, int totalPages) {
        super(title, author, itemId);
        this.totalPages = totalPages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Total Pages: " + totalPages);
    }
}
