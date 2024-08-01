public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        if (tonerLevel < 0) {
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = tonerLevel;
        }

        if (pagesPrinted < 0) {
            this.pagesPrinted = 0;
        } else {
            this.pagesPrinted = pagesPrinted;
        }

        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerLevel + tonerAmount > 100) {
            return -1;
        } else if (tonerAmount > 0) {
            tonerLevel += tonerAmount;
        }
        return -1;
    }

    public int printPages(int pages) {
        if(duplex) {
            System.out.println("Duplex printer will print on the both sides of a sheet.");
            pagesPrinted += Math.round(pages / 2);
            return Math.round(pages / 2);
        } else {
            pagesPrinted += pages;
            return pages;
        }
    }
}
