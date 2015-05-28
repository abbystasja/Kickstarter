package com.kickstarter.processing;

import com.kickstarter.controller.Controller;
import com.kickstarter.controller.MainController;
import com.kickstarter.entities.Category;
import com.kickstarter.entities.Project;
import com.kickstarter.entities.Quote;
import com.kickstarter.repository.ModelsRepository;

import java.util.Calendar;

/**
 * Created by akulygina on 5/27/2015.
 */
public class Kickstarter {

    public Kickstarter(){}

    public void run(){
        Controller controller = new MainController(null);
        while(controller!=null) {
            controller = controller.process();
        }
    }


    public static void main(String[] args) {
        //initing of quotesModel
        ModelsRepository.getQuotesModelInstance().addQuote(new Quote("\"After all is said and done, more is said than done.\""));
        ModelsRepository.getQuotesModelInstance().addQuote(new Quote("\"The worst solitude is to be destitute of sincere friendship.\""));
        ModelsRepository.getQuotesModelInstance().addQuote(new Quote("\"Never make fun of someone who speaks broken English. It means they know another language.\""));

        Category category1 = new Category("Music");
        Category category2 = new Category("IT project");
        Category category3 = new Category("Comics");

        Calendar c = Calendar.getInstance();
        c.set(2015, 12, 31);

        ModelsRepository.getCategoryModelInstance().addProjectForCategory(category1,
                new Project("Rock", "Sweet old rock", 1000, 200, c.getTime()));
        ModelsRepository.getCategoryModelInstance().addProjectForCategory(category1,
                new Project("Opera", "For that who loves classic", 20000, 1800, c.getTime()));
        ModelsRepository.getCategoryModelInstance().addProjectForCategory(category1,
                new Project("Pop", "Mindless though quite pretty", 100000, 0, c.getTime()));

        ModelsRepository.getCategoryModelInstance().addProjectForCategory(category2,
                new Project("Kickstarter", "This project also needs donates", 500, 0, c.getTime()));
        ModelsRepository.getCategoryModelInstance().addProjectForCategory(category2,
                new Project("Chatting", "Well we need some change to Microsofts skype", 100000, 628, c.getTime()));
        ModelsRepository.getCategoryModelInstance().addProjectForCategory(category2,
                new Project("New LMS", "Our one is quite in a pitty state", 5000, 0, c.getTime()));

        ModelsRepository.getCategoryModelInstance().addProjectForCategory(category3,
                new Project("SuperMan", "No need to comment", 1000, 200, c.getTime()));
        ModelsRepository.getCategoryModelInstance().addProjectForCategory(category3,
                new Project("Oban", "Japan classic", 20000, 1800, c.getTime()));
        ModelsRepository.getCategoryModelInstance().addProjectForCategory(category3,
                new Project("The wolf", "Well new detective is comming", 100000, 0, c.getTime()));

        Kickstarter kickstarter = new Kickstarter();
        kickstarter.run();
    }
}
