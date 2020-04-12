package ru.pupkov.stas.cdek.domain;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.sql.Date;

public class Filter3 {

    @Nullable
    public static Specification<TaskForCalling> checkCompleted(int orderNumber) {
        return new Specification<TaskForCalling>() {
            @Override
            public Predicate toPredicate(Root<TaskForCalling> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.equal(root.get("orderId"), orderNumber);
            }
        };
    }
}
