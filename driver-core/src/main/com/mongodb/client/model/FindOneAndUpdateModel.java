/*
 * Copyright (c) 2008-2014 MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mongodb.client.model;

import static com.mongodb.assertions.Assertions.notNull;

/**
 * Finds a single document and updates it.
 *
 * @since 3.0
 * @mongodb.driver.manual manual/reference/command/findAndModify/
 */
public class FindOneAndUpdateModel {
    private final Object criteria;
    private final Object update;
    private final FindOneAndUpdateOptions options;

    /**
     * Construct a new instance
     *
     * @param criteria the query criteria. This can be of any type for which a {@code Codec} is registered.
     * @param update the update operation. This can be of any type for which a {@code Codec} is registered.
     * @mongodb.driver.manual manual/reference/command/findAndModify/
     */
    public FindOneAndUpdateModel(final Object criteria, final Object update) {
        this(criteria, update, new FindOneAndUpdateOptions());
    }

    /**
     * Construct a new instance
     *
     * @param criteria the query criteria. This can be of any type for which a {@code Codec} is registered.
     * @param update the update operation. This can be of any type for which a {@code Codec} is registered.
     * @param options the options to apply
     * @mongodb.driver.manual manual/reference/command/findAndModify/
     */
    public FindOneAndUpdateModel(final Object criteria, final Object update, final FindOneAndUpdateOptions options) {
        this.criteria = notNull("criteria", criteria);
        this.update = notNull("update", update);
        this.options = notNull("options", options);
    }

    /**
     * Gets the query criteria.
     *
     * @return the query criteria
     */
    public  Object getCriteria() {
        return criteria;
    }

    /**
     * Gets the document specifying the updates to apply to the matching document.  The update to apply must include only update
     * operators.
     *
     * @return the document specifying the updates to apply
     */
    public Object getUpdate() {
        return update;
    }

    /**
     * Gets the options to apply.
     *
     * @return the options
     */
    public FindOneAndUpdateOptions getOptions() {
        return options;
    }
}