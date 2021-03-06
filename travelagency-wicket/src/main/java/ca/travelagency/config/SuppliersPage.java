/**
 *    Copyright (C) 2010 - 2014 VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package ca.travelagency.config;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;

@AuthorizeInstantiation({"ADMIN"})
public class SuppliersPage extends LookupEntitiesPage<Supplier> {
	private static final long serialVersionUID = 1L;

	static final String LABEL_KEY = "lookup.label.supplier";
	static final String PAGE_KEY = "lookup.suppliers.title";

    public SuppliersPage() {
    	this(null);
    }

    public SuppliersPage(LookupEntitiesFilter lookupEntitiesFilter) {
    	super(lookupEntitiesFilter);
	}

	@Override
	public String getPageTitleKey() {
		return PAGE_KEY;
	}

	@Override
	public Class<?> getTrueClass() {
		return Supplier.class;
	}

	@Override
	public String getLabelNameKey() {
		return LABEL_KEY;
	}

	@Override
	public LookupEntitiesPage<Supplier> makeLookupEntitiesPage(LookupEntitiesFilter lookupEntitiesFilter) {
		return new SuppliersPage(lookupEntitiesFilter);
	}
}