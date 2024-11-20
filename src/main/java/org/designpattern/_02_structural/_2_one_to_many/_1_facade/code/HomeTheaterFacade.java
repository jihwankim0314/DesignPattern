package org.designpattern._02_structural._2_one_to_many._1_facade.code;

import org.designpattern._02_structural._2_one_to_many._1_facade.code.subsystems.Projector;
import org.designpattern._02_structural._2_one_to_many._1_facade.code.subsystems.Screen;
import org.designpattern._02_structural._2_one_to_many._1_facade.code.subsystems.Speaker;

public class HomeTheaterFacade {
    private Projector projector;
    private Screen screen;
    private Speaker speaker;

    public HomeTheaterFacade(Projector projector, Screen screen, Speaker speaker) {
        this.projector = projector;
        this.screen = screen;
        this.speaker = speaker;
    }

    public void watchMovie() {
        projector.on();
        screen.down();
        speaker.setVolume(10);
    }

    public void endMovie() {
        projector.off();
        screen.up();
        speaker.setVolume(0);
    }
}
