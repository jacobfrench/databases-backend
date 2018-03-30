package stu.csub.dbproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "routes")
public class Route {
	
	@Id
	@Column(name="routeid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer routeId;
	@Column(name="routename")
	private String routeName;
	

//	@OneToMany
//	@JsonIgnore
//	private Set<Property> properties;
	
	public Route() {}
	
	public Route(Integer routeId, String routeName, String techrouteId) {
		this.routeId = routeId;
		this.routeName = routeName;
//		this.properties = new HashSet<Property>();
		
	}

	public Integer getrouteId() {
		return routeId;
	}

	public void setrouteId(Integer routeId) {
		this.routeId = routeId;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	
//	public Set<Property> getProperties() {
//		return properties;
//	}
//	
//	public void setProperties(Set<Property> properties) {
//		this.properties = properties;
//	}
//	
//	public void addProperty(Property property) {
//		this.properties.add(property);
//	}
	
}
