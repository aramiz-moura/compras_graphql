package com.example.graphql_compras.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TouristInfo {

    private Long id;
    private String touristName;
    private String touristEmail;
    private String touristLocation;
    private String createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTouristName() {
        return touristName;
    }

    public void setTouristName(String touristName) {
        this.touristName = touristName;
    }

    public String getTouristEmail() {
        return touristEmail;
    }

    public void setTouristEmail(String touristEmail) {
        this.touristEmail = touristEmail;
    }

    public String getTouristLocation() {
        return touristLocation;
    }

    public void setTouristLocation(String touristLocation) {
        this.touristLocation = touristLocation;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
