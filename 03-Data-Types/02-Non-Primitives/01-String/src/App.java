public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("String Data Type!");

        // String data type is used to store a sequence of characters
        // String is not a primitive data type, it's a class

        String myString = "This is a string";
        System.out.println("String Value = " + myString);

        // String reassignment
        myString = "This is another string";
        System.out.println("String Value = " + myString);

        // Get the type of the data
        System.out.println("String Data Type = " + myString.getClass().getSimpleName());
    
        // Get the length of the data
        myString = "The quick brown fox jumps over the lazy dog";
        System.out.println("String Length = " + myString.length());

        // Case conversion
        System.out.println("String Value = " + myString.toUpperCase());
        System.out.println("String Value = " + myString.toLowerCase());
        
        // Text Blocks
        String html = """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;
        System.out.println(html);
        
    }
}
