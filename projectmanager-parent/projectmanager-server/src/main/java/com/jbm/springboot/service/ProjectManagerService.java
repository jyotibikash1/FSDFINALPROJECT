package com.jbm.springboot.service;

import java.util.List;

import com.jbm.springboot.bo.ParentTaskVO;
import com.jbm.springboot.bo.ProjectVO;
import com.jbm.springboot.bo.TaskVO;
import com.jbm.springboot.bo.UserVO;

public interface ProjectManagerService {
	
	public List<TaskVO> retriveTasks();
	public void updateTask(TaskVO task);
	
	public List<ParentTaskVO> retriveParentTasks();
	public List<ParentTaskVO> retriveParentTasksForProjectId(String projectId);
	public void updateParentTask(ParentTaskVO parentTask);
	
	public List<ProjectVO> retriveProjects();
	public void updateProject(ProjectVO project);
	
	public List<UserVO> retriveUsers();
	public void updateUser(UserVO user);

}
