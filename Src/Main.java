import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PopMusic popBand = new PopMusic();
        RockMusic rockBand = new RockMusic();
        ClassicMusic classicOrchestra = new ClassicMusic();

        popBand.playMusic();
        rockBand.playMusic();
        classicOrchestra.playMusic();

        List<MusicStyles> musicList = new ArrayList<>();
        musicList.add(new PopMusic());
        musicList.add(new RockMusic());
        musicList.add(new ClassicMusic());

        musicList.forEach(MusicStyles::playMusic);

    }

}
