package lab11;

public class ObserverPatternDemo
{
    public static void main(String[] args)
    {
        YouTubeChannel channel = new YouTubeChannel("Tech Explained");

        MediaInterested media1 = new MediaInterested("CNN");
        MediaInterested media2 = new MediaInterested("FoxNews");

        channel.register(media1);
        channel.register(media2);
        channel.uploadeVideo("Observer Pattern in Java");

        channel.unregister(media2);
        channel.uploadeVideo("Singleton Pattern in Java");
    }
}
