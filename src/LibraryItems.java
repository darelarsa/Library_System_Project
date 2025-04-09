class LibraryItems {
    private String title;
    private String author;
    private int itemId;
    private boolean isAvailable;

    public LibraryItems(String title, String author, int itemId) {
        this.title = title;
        this.author = author;
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

    public void displayInfo() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }

} 