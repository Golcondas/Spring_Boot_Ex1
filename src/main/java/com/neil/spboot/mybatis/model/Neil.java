package com.neil.spboot.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Neil {
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