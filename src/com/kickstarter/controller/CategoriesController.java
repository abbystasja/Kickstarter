package com.kickstarter.controller;

import com.kickstarter.entities.Category;
import com.kickstarter.entities.Project;
import com.kickstarter.repository.ModelsRepository;
import com.kickstarter.view.CategoriesView;
import com.kickstarter.view.View;

import java.util.List;

/**
 * Created by akulygina on 5/28/2015.
 */
public class CategoriesController extends Controller {

    private int categorySelected;
    private List<Project> projectList;

    public CategoriesController(Controller prevController, Category category) {
        this(prevController);
        projectList = ModelsRepository.getCategoryModelInstance().getProjectsForCategory(category);
    }

    public CategoriesController(Controller prevController) {
        super(prevController);
    }

    @Override
    public boolean outOfRange(int nextPosition) {
        return nextPosition >= 0 && nextPosition <= projectList.size();
    }

    @Override
    public View getPage() {
        return new CategoriesView(projectList);
    }

    @Override
    public Controller getNextController(int nextPosition) {
        return new ProjectController(this, projectList.get(nextPosition - 1));
    }
}
