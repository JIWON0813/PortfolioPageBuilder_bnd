package com.example.portfoliopagebuilder_bnd.techblog.model.entity;

import com.example.portfoliopagebuilder_bnd.common.util.StringMapConverter;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.LinkedHashMap;

@Entity
@Data
@NoArgsConstructor
public class TechFavoriteEntity {

    @Id
    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "blod_id",columnDefinition = "JSON")
    @Convert(converter = StringMapConverter.class)
    private LinkedHashMap<String,Object> blodId;

    @Column(name = "write_date")
    private DateTime writeDate;

    @Column(name = "modify_date")
    private DateTime modifyDate;
}
