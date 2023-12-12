import java.util.ArrayList;
import java.util.List;

/**
 * The ProjectList class manages lists of completed and unfinished projects.
 * It provides methods to add, retrieve, remove, and search for projects in both lists.
 *
 * @author
 * @version 1.0 - December 2023
 */
public class ProjectList {
  private List<Project> completedProjects = new ArrayList<>();
  private List<Project> unfinishedProjects = new ArrayList<>();

  /**
   * Constructs a new ProjectList with empty lists for completed and unfinished projects
   */
  public ProjectList(){
    completedProjects=new ArrayList<>();
    unfinishedProjects=new ArrayList<>();
  }

  /**
   * Getter for the list of completed projects
   *
   * @return The list of completed projects
   */
  public List<Project> getCompletedProjects() {
    return completedProjects;
  }

  /**
   * Getter for the list of unfinished projects
   *
   * @return The list of unfinished projects
   */
  public List<Project> getUnfinishedProjects() {
    return unfinishedProjects;
  }

  /**
   * Adds a project to the appropriate list based on its finished status
   * @param project The project to be added
   * @param isFinished True if the project is finished, false otherwise
   */

  public void addProject(Project project, boolean isFinished) {
    if (isFinished) {
      completedProjects.add(project);
    } else {
      unfinishedProjects.add(project);
    }
  }


  /**
   * Retrieves a project by its unique identifier
   *
   * @param id The unique identifier of the project
   * @return The project with the specified ID, or null if not found
   */
  public Project retrieveProjectById(double id) {
    for (Project p : completedProjects) {
      if (p.getId() == id) {
        return p;
      }
    }

    for (Project p : unfinishedProjects) {
      if (p.getId() == id) {
        return p;
      }
    }

    return null;
  }

  /**
   * Removes a project from the appropriate list based on its finished status
   *
   * @param project     The project to be removed
   * @param isFinished  True if the project is finished, false otherwise
   */
  public void removeProject(Project project, boolean isFinished) {
    if (isFinished) {
      completedProjects.remove(project);
    } else {
      unfinishedProjects.remove(project);
    }
  }

  /**
   * Search for a project by its project type
   *
   * @param projectType The type of the project
   * @return The first project with the specified project type, or null if not found
   */
  public Project searchProjectByType(String projectType) {
    for (Project p : completedProjects) {
      if (p.getProjectType().equals(projectType)) {
        return p;
      }
    }

    for (Project p : unfinishedProjects) {
      if (p.getProjectType().equals(projectType)) {
        return p;
      }
    }

    return null;
  }

  /**
   * Marks an unfinished project as finished based on its unique identifier
   *
   * @param projectId The unique identifier of the project
   */
  public void markProjectAsFinished(double projectId) {
    Project projectToMark = null;

    for (Project project : unfinishedProjects) {
      if (project.getId() == projectId) {
        projectToMark = project;
        break;
      }
    }

    if (projectToMark != null) {
      unfinishedProjects.remove(projectToMark);
      completedProjects.add(projectToMark);
    } else {
      System.out.println("Project with ID " + projectId + " not found in the unfinished projects list.");
    }
  }
}
