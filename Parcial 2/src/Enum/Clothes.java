package Enum;


public enum Clothes {
    BLOUSE("Purple Blouse","Large",2){
        public String showDescription() {
            return "50% Cotton";
        }
    },
    JEAN("Grey Jean","Medium",3){
        public String showDescription() {
            return "80% Cotton";
        }

    },
    TSHIRT("Black T-shirt","Short",4){
        public String showDescription() {
            return "10% Cotton";
        }

    },
    SHIRT("White Shirt","Big",5){
        public String showDescription() {
            return "90% Cotton";
        }

    };

    public abstract String showDescription();
    private  String name;
    private String description;
    private int numShelf;

    Clothes(String name, String description, int numShelf) {
        this.name = name;
        this.description = description;
        this.numShelf = numShelf;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumShelf() {
        return numShelf;
    }

    public static void show(){
        System.out.println("=====CLOTHES=======");
        System.out.println("-Name: "+ BLOUSE.getName()+ " -Description: " + BLOUSE.getDescription()+" -Shelf Number: " + BLOUSE.getNumShelf());
        System.out.println("-----------------------------");
        System.out.println(BLOUSE.showDescription());
        System.out.println("-----------------------------");
        System.out.println("-Name: "+ JEAN.getName()+ " -Description: " + JEAN.getDescription()+" -Shelf Number: " + JEAN.getNumShelf());
        System.out.println("-----------------------------");
        System.out.println(JEAN.showDescription());
        System.out.println("-----------------------------");
        System.out.println("-Name: "+ TSHIRT.getName()+ " -Description: " + TSHIRT.getDescription()+" -Shelf Number: " + TSHIRT.getNumShelf());
        System.out.println("-----------------------------");
        System.out.println(TSHIRT.showDescription());
        System.out.println("-----------------------------");
        System.out.println("-Name: "+ SHIRT.getName()+ " -Description: " + SHIRT.getDescription()+" -Shelf Number: " + SHIRT.getNumShelf());
        System.out.println("-----------------------------");
        System.out.println(SHIRT.showDescription());
        System.out.println("-----------------------------");
    }
}

 class MainEnum {
    public static void main(String[] args) {
        Clothes.show();

    }
}