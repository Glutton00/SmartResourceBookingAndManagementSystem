package dto;

public class Resourcedto {

	private String resourceId;
	private String resName;
	private String resType;
	private double resCost;
	private boolean isAvailable;

	public Resourcedto(String resourceId, String resName, String resType, double resCost, boolean isAvailable) {
		this.resourceId = resourceId;
		this.resName = resName;
		this.resType = resType;
		this.resCost = resCost;
		this.isAvailable = isAvailable;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public String getResType() {
		return resType;
	}

	public void setResType(String resType) {
		this.resType = resType;
	}

	public double getResCost() {
		return resCost;
	}

	public void setResCost(double resCost) {
		this.resCost = resCost;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
