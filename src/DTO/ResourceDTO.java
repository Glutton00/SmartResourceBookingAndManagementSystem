package DTO;

public class ResourceDTO {
	private String resourceId;
	private String resourceType;
	private String resourceName;
	private double resourceCost;
	private boolean isAvailable;

	public ResourceDTO(String resourceId, String resourceType, String resourceName, double resourceCost,
			boolean isAvailable) {
		this.resourceId = resourceId;
		this.resourceType = resourceType;
		this.resourceName = resourceName;
		this.resourceCost = resourceCost;
		this.isAvailable = isAvailable;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public double getResourceCost() {
		return resourceCost;
	}

	public void setResourceCost(double resourceCost) {
		this.resourceCost = resourceCost;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean available) {
		isAvailable = available;
	}
}
