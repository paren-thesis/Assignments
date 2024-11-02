public class MessedArrays{

    public void greetThem(String[] names) {
        for (String string : names) {
            System.out.println("Hello there " + string + ", nice to meet you");
        }
    }

    public static void main(String[] args) {
        MessedArrays m = new MessedArrays();
        String[] names = {"Kofi", "Ama", "Joe", "Yaw", "Kobi", "Aba"};

        m.greetThem(names);
    }
}