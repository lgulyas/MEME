/*******************************************************************************
 * Copyright (C) 2006-2013 AITIA International, Inc.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package ai.aitia.meme.paramsweep.coltPlugin;

import java.util.Arrays;
import java.util.List;

import ai.aitia.meme.paramsweep.colt.DoubleArrayList;
import ai.aitia.meme.paramsweep.plugin.IStatisticsPlugin;

/** Statistic method decriptor plugin. This method returns the pooled mean of two data
 *  sequences. That is (size1 * mean1 + size2 * mean2) / (size1 + size2).
 */
public class Colt_PooledMean implements IStatisticsPlugin {

	//=====================================================================================
	// methods

	//-------------------------------------------------------------------------------------
	public String getName() { return "pooledMean"; }
	public String getLocalizedName() { return "Pooled mean"; }
	public String getFullyQualifiedName() { return "ai.aitia.meme.paramsweep.colt.Descriptive.pooledMean"; }
	public int getNumberOfParameters() { return 2; }
	public List<String> getParameterNames() { return Arrays.asList(new String[] { "data1", "data2" }); }
	public List<Class> getParameterTypes() { return Arrays.asList(new Class[] { DoubleArrayList.class, DoubleArrayList.class }); }
	public Class getReturnType() { return Double.TYPE; }
	public String getDescription() { return "Computes the pooled mean of two data sequences. That is (size1 * mean1 + size2 * mean2) / (size1 + size2)."; }
	public List<String> getParameterDescriptions() { return Arrays.asList(new String[] { "The first data sequence", "The second data sequence" }); }
}
