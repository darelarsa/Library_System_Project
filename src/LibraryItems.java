class LibraryItems {
    protected String title;
    protected String author;
    protected String publisher;
    protected String publishDate;
    private String itemId;
    private boolean isAvailable;

    public LibraryItems(String title, String author, String publisher, String publishDate, String itemId) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.itemId = itemId;
        this.isAvailable = true;
    }

    public void borrowItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is currently unavailable.");
        }
    }

    public void returnItem() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }

} 