package com.neil.spboot.mybatis.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class neilDomain {
    private Integer idneil;

    private String neilname;

    public Integer getIdneil() {
        return idneil;
    }

    public void setIdneil(Integer idneil) {
        this.idneil = idneil;
    }

    public String getNeilname() {
        return neilname;
    }

    public void setNeilname(String neilname) {
        this.neilname = neilname;
    }
}