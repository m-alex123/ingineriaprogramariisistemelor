package lab11;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject
{
    private String channelName;
    private List<Observer>observers=new ArrayList<>();
    private String latestVideo;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void register(Observer observer)
    {
        this.observers.add(observer);
    }
    @Override
    public void unregister(Observer observer) {this.observers.remove(observer);}
    @Override
    public void notifyObservers()
    {
        for(Observer observer:observers)
            observer.update(latestVideo);
    }


    public void uploadeVideo(String title) {
        System.out.println("{"+ channelName + "} uploaded a new video: " + title);
        this.latestVideo=title;
        notifyObservers();
    }
}