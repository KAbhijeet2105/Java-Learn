package creationalPatterns.builderExample;

public class Demo {
    public static void main(String[] args) {

        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocol("http://").hostname("google.com").port("8888");
        URLBuilder urlBuilder = builder.build();

        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostname);
        System.out.print(urlBuilder.port);

    }

}
