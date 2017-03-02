/*
*     This file is part of the VCF.Filter project (https://biomedical-sequencing.at/VCFFilter/).
*     VCF.Filter permits graphical filtering of VCF files on cutom annotations and standard VCF fields, pedigree analysis, and cohort searches.
* %%
*     Copyright © 2016, 2017  Heiko Müller (hmueller@cemm.oeaw.ac.at)
* %%
* 
*     VCF.Filter is free software: you can redistribute it and/or modify
*     it under the terms of the GNU General Public License as published by
*     the Free Software Foundation, either version 3 of the License, or
*     (at your option) any later version.
* 
*     This program is distributed in the hope that it will be useful,
*     but WITHOUT ANY WARRANTY; without even the implied warranty of
*     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*     GNU General Public License for more details.
* 
*     You should have received a copy of the GNU General Public License
*     along with VCF.Filter.  If not, see <http://www.gnu.org/licenses/>.
* 
*     VCF.Filter  Copyright © 2016, 2017  Heiko Müller (hmueller@cemm.oeaw.ac.at)
*     This program comes with ABSOLUTELY NO WARRANTY;
*     This is free software, and you are welcome to redistribute it
*     under certain conditions; 
*     For details interrogate the About section in the File menu. 
*/
package at.ac.oeaw.cemm.bsf.vcffilter.preferences;

import java.awt.Frame;

/** 
 * FileHelpDialog.
 * FileHelpDialog.java 04 OCT 2016 
 *
 * @author Heiko Müller
 * @version 1.0
 * @since 1.0
 */
public class FileHelpDialog extends HelpDialog{
    
    /**
     * The version number of this class.
     */
    static final long serialVersionUID = 1L;
    
    private static final String title = "Files help";
    private static final String helpText = "Sample VCF file:\r\n"
            + "Setting this file is required for VCFFilter to start up successfully. "
            + "The file must contain a valid VCF header. "
            + "VCFFilter will create filters for all Info header fields "
            + "as well as for the standard fields CHROM, POS, ID, REF, ALT, QUAL, and FILTER.\r\n\r\n"
            + "VCFDirecory:\r\n"
            + "This is the directory where VCFFilter expects VCF files. "
            + "When VCF files are opened, the filechooser will start listing files found in this directory "
            + "This directory can be any directory on yourfile system "
            + "and is initially set to the directory where the sample VCF file is located. "
            + "We suggest using the VCFData directory that is located in the "
            + "same directory where the VCFFilter.jar is located.\r\n\r\n"
            + "Recurrence files:\r\n"
            + "Recurrence files list the frequency of variants in your cohort. "
            + "Recurrence files can be generated using the filter tab with the \"Calculate recurrence\" option "
            + "and opening all VCF files of your cohort. Current filter criteria will be applied "
            + "and all variants passing the filter will be recorded with their observed frequency in heterozygous and homozygous state. "
            + "Recurrence filtering effectivly eliminates frequent variants such as those found due to erroneous reference sequence assembly "
            + "or etnicity related variants from the filter results.\r\n\r\n"
            + "White lists:\r\n"
            + "White lists contain genomic intervals of interest such as exons or homozygosity regions. "
            + "Bed format and PLINK hom format are currently accepted. "
            + "When white list filtering is active, only variants in these regions will be reported. "
            + "Note that white list filtering also significantly speeds up VCF filtering.\r\n\r\n"
            + "Black lists:\r\n"
            + "Black lists contain genomic intervals to be ignored. Variants in these regions will not be reported. "
            + "Bed format and PLINK hom format are currently accepted. ";
    
    
    /**
    * Creates new FileHelpDialog.
    * 
    * @param parent parent frame
    * @param modal is dialog modal
    * @author Heiko Müller
    * @since 1.0
    */
    public FileHelpDialog(Frame parent, boolean modal){
        super(parent, modal);        
        setDialogTitle(title);
        setHelpText(helpText);
        init();
    }
}
