package org.designpattern._02_structural._2_one_to_many._1_facade.code;

import org.designpattern._02_structural._2_one_to_many._1_facade.code.subsystems.Projector;
import org.designpattern._02_structural._2_one_to_many._1_facade.code.subsystems.Screen;
import org.designpattern._02_structural._2_one_to_many._1_facade.code.subsystems.Speaker;

public class FacadeClient {
    public static void main(String[] args) {
        Projector projector = new Projector();
        Screen screen = new Screen();
        Speaker speaker = new Speaker();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(projector, screen, speaker);

        homeTheater.watchMovie();
        homeTheater.endMovie();
    }
}
