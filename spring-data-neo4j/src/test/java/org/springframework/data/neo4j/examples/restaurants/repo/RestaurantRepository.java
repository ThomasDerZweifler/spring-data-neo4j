/*
 * Copyright (c)  [2011-2016] "Pivotal Software, Inc." / "Neo Technology" / "Graph Aware Ltd."
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with
 * separate copyright notices and license terms. Your use of the source
 * code for these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 *
 */

package org.springframework.data.neo4j.examples.restaurants.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.neo4j.examples.restaurants.domain.Restaurant;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * @author Jasper Blues
 */
public interface RestaurantRepository extends GraphRepository<Restaurant> {

	List<Restaurant> findByNameAndLocationNear(String name, Distance distance, Point point);

	List<Restaurant> findByLocationNearAndName(Distance distance, Point point, String name);

}
