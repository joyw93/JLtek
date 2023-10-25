package com.jltek.demo.estimate.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QEstimate is a Querydsl query type for Estimate
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QEstimate extends EntityPathBase<Estimate> {

    private static final long serialVersionUID = 78048011L;

    public static final QEstimate estimate = new QEstimate("estimate");

    public final StringPath content = createString("content");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath title = createString("title");

    public QEstimate(String variable) {
        super(Estimate.class, forVariable(variable));
    }

    public QEstimate(Path<? extends Estimate> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEstimate(PathMetadata metadata) {
        super(Estimate.class, metadata);
    }

}

