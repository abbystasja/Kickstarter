package com.kickstarter.model;

import com.kickstarter.entities.Category;
import com.kickstarter.entities.Project;

import java.util.*;

/**
 * Created by akulygina on 5/27/2015.
 */
public class CategoryModel {
    private Map<Category, List<Project>> categories;

    public CategoryModel(){
        categories = new HashMap<Category, List<Project>>();
    }

    public void addProjectForCategory(Category category, Project project){
        if(!categories.containsKey(category)){
            categories.put(category, new ArrayList<Project>());
        }
        categories.get(category).add(project);
    }

    public Set<Category> getCategories(){
        return categories.keySet();
    }

    public List<Project> getProjectsForCategory(Category category){
        return categories.get(category);
    }

}
