package com.adobe.aem.guides.wknd.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)

public class CustomCardModel {

    @ValueMapValue 
    private String title;

    @ValueMapValue
    private String description;

    @ValueMapValue 
    private String imagePath;

    public String getTitle()
    {
        return title;
    }

    public String getDescription()
    {
        return description;
    }
    
    public String getImagePath()
    {
        return imagePath;
    }
}
