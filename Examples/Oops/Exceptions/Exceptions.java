class Exceptions {
    public static void main(String[] args) {
        try {
            throw new Error("custom error message");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {

        }
    }    
}
