package com.tandan.springbootmvc.model;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien ,Integer> {
    //List<Alien> findByAname(String aname);

    @Query("from Alien where aname= :name")
    List<Alien> find(@Param("name") String aname);
}