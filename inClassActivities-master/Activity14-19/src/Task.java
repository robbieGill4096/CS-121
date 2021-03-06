public class Task implements Comparable<Task>{
	private String description;
	private int priority;
	private boolean complete;

	public Task(String description) {
		this.description = description;
		this.priority = 0;

	}

	public Task(String description, int priority) {
		this.description = description;
		this.priority = priority;

	}

	public String getDescription() {
		return description;

	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;

	}

	public boolean isComplete() {
		return this.complete;
	}

	public boolean equals(Task Task) {
		String comparedtaskDesc = this.description;
		String descrip = Task.getDescription();
		if (descrip.equalsIgnoreCase(comparedtaskDesc)) {
			return true;
		}
		return false;}
	
	public String toString() {
		if (this.isComplete()) {
			String taskString = ("[X]" + " " + description + ", " + priority);
			return taskString;
		}
		String taskString = ("[ ]" + " " + description + ", " + priority);
		return taskString;
	}
	
	
	@Override
	public int compareTo(Task o) {
		boolean compThisTask = this.isComplete();
		boolean compOtherTask = o.isComplete();
		
		Integer priorThisTask = this.getPriority();
		Integer priorOtherTask = o.getPriority();
		
		if((compThisTask && compOtherTask) == true || (compThisTask && compOtherTask) == false) {
			if ((priorThisTask.equals(priorOtherTask))) {
				return 0;
			}
			if (priorThisTask < priorOtherTask) {
				return -1;
			}
			if (priorThisTask > priorOtherTask) {
				return 1;
			}
		else if ((compThisTask) == true || (compOtherTask) == false)  {
			return -1;
			}
		else {
			return 1;
			
		}
			
		}
		
		// TODO Auto-generated method stub
		return 0; }
	
}