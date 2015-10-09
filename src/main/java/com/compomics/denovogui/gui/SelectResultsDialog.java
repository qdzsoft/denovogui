package com.compomics.denovogui.gui;

import com.compomics.denovogui.io.FileProcessor;
import com.compomics.util.Util;
import com.compomics.util.experiment.identification.identification_parameters.SearchParameters;
import com.compomics.util.gui.filehandling.FileSelectionDialog;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;

/**
 * Dialog for selecting DeNovoGUI results to display.
 *
 * @author Marc Vaudel
 * @author Harald Barsnes
 */
public class SelectResultsDialog extends javax.swing.JDialog {

    /**
     * Indicates whether the user canceled the dialog.
     */
    private boolean canceled = true;
    /**
     * The result files selected.
     */
    private ArrayList<File> resultFiles = new ArrayList<File>();
    /**
     * The mgf files selected.
     */
    private ArrayList<File> mgfFiles = new ArrayList<File>();
    /**
     * The search parameters.
     */
    private SearchParameters searchParameters = null;
    /**
     * The last selected folder.
     */
    private String lastSelectedFolder = null;
    /**
     * The parent frame.
     */
    private JFrame parentFrame;

    /**
     * Creates a new SelectResultsDialog.
     *
     * @param parent the parent
     * @param lastSelectedFolder the last selected folder
     */
    public SelectResultsDialog(JFrame parent, String lastSelectedFolder) {
        super(parent, true);
        this.parentFrame = parent;
        this.lastSelectedFolder = lastSelectedFolder;
        initComponents();
        setLocationRelativeTo(parent);
        setVisible(true);
    }

    /**
     * Indicates whether the user canceled the dialog.
     *
     * @return whether the user canceled the dialog
     */
    public boolean isCanceled() {
        return canceled;
    }

    /**
     * Returns the result files selected by the user.
     *
     * @return the result files selected by the user
     */
    public ArrayList<File> getResultFiles() {
        return resultFiles;
    }

    /**
     * Returns the mgf files selected by the user.
     *
     * @return the mgf files selected by the user
     */
    public ArrayList<File> getMgfFiles() {
        return mgfFiles;
    }

    /**
     * Returns the search parameters selected by the user.
     *
     * @return the search parameters selected by the user
     */
    public SearchParameters getSearchParameters() {
        return searchParameters;
    }

    /**
     * Returns the last selected folder
     *
     * @return the last selected folder
     */
    public String getLastSelectedFolder() {
        return lastSelectedFolder;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        outputPanel = new javax.swing.JPanel();
        browseOutButton = new javax.swing.JButton();
        outTxt = new javax.swing.JTextField();
        resultsLabel = new javax.swing.JLabel();
        spectraLabel = new javax.swing.JLabel();
        settingsLabel = new javax.swing.JLabel();
        browseMgfButton = new javax.swing.JButton();
        browseParametersButton = new javax.swing.JButton();
        mgfTxt = new javax.swing.JTextField();
        paramtersTxt = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Open Results");
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(230, 230, 230));

        outputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Select DeNovoGUI Output"));
        outputPanel.setOpaque(false);

        browseOutButton.setText("Browse");
        browseOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseOutButtonActionPerformed(evt);
            }
        });

        outTxt.setEditable(false);
        outTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        resultsLabel.setText("De Novo Results");
        resultsLabel.setToolTipText("De Novo Sequencing Result Files");

        spectraLabel.setText("Spectra");

        settingsLabel.setText("Settings");

        browseMgfButton.setText("Browse");
        browseMgfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseMgfButtonActionPerformed(evt);
            }
        });

        browseParametersButton.setText("Browse");
        browseParametersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseParametersButtonActionPerformed(evt);
            }
        });

        mgfTxt.setEditable(false);
        mgfTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        paramtersTxt.setEditable(false);
        paramtersTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(outputPanelLayout.createSequentialGroup()
                        .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(outputPanelLayout.createSequentialGroup()
                                .addComponent(resultsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(outTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, outputPanelLayout.createSequentialGroup()
                                .addComponent(settingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(paramtersTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(browseOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(browseParametersButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(outputPanelLayout.createSequentialGroup()
                        .addComponent(spectraLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mgfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browseMgfButton)))
                .addContainerGap())
        );

        outputPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {browseMgfButton, browseOutButton, browseParametersButton});

        outputPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {resultsLabel, settingsLabel, spectraLabel});

        outputPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {mgfTxt, outTxt, paramtersTxt});

        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browseOutButton)
                    .addComponent(outTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spectraLabel)
                    .addComponent(browseMgfButton)
                    .addComponent(mgfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(settingsLabel)
                    .addComponent(browseParametersButton)
                    .addComponent(paramtersTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        okButton.setText("OK");
        okButton.setEnabled(false);
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Opens a file chooser to select the out files.
     *
     * @param evt
     */
    private void browseOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseOutButtonActionPerformed

        JFileChooser fileChooser = new JFileChooser(lastSelectedFolder);
        fileChooser.setDialogTitle("Select Identification File");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setMultiSelectionEnabled(true);

        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File myFile) {

                if (myFile.getName().equalsIgnoreCase("mods.xml")
                        || myFile.getName().equalsIgnoreCase("usermods.xml")) {
                    return false;
                }

                return myFile.getName().toLowerCase().endsWith(".out")
                        || myFile.getName().toLowerCase().endsWith(".tags")
                        || myFile.getName().toLowerCase().endsWith(".pnovo.txt")
                        || myFile.getName().toLowerCase().endsWith(".novor.csv")
                        || myFile.getName().toLowerCase().endsWith(".mzid")
                        || myFile.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Supported formats: DirecTag (.tags), PepNovo+ (.out), pNovo+ (.pnovo.txt) and Novor (.novor.csv)";
            }
        };

        fileChooser.setFileFilter(filter);

        int returnVal = fileChooser.showDialog(this, "OK");

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File[] selectedFiles = fileChooser.getSelectedFiles();

            if (selectedFiles != null && selectedFiles.length > 0) {

                resultFiles = new ArrayList<File>();
                ArrayList<File> parameterFiles = new ArrayList<File>();
                for (File file : selectedFiles) {
                    if (file.exists()) {
                        resultFiles.add(file);
                        try {
                            // see if the mgf file can be found
                            File tempMgfFile = FileProcessor.getMgfFile(file);
                            if (tempMgfFile.exists() && !mgfFiles.contains(tempMgfFile)) {
                                mgfFiles.add(tempMgfFile);
                            }
                        } catch (IllegalArgumentException e) {
                            // ignore, just means the given mgf file does not exist
                        }
                        lastSelectedFolder = file.getParent();
                    }
                }
                File parentFolder = new File(lastSelectedFolder);
                for (File file : parentFolder.listFiles()) {
                    if (file.getName().toLowerCase().endsWith(".par") && !parameterFiles.contains(file)) {
                        parameterFiles.add(file);
                    }
                }
                outTxt.setText(resultFiles.size() + " file(s) selected");
                if (!mgfFiles.isEmpty()) {
                    mgfTxt.setText(mgfFiles.size() + " file(s) selected");
                }

                // try to find the parameters file
                File parameterFile = null;
                if (parameterFiles.size() == 1) {
                    parameterFile = parameterFiles.get(0);
                } else if (parameterFiles.size() > 1) {

                    boolean equalParameters = true;

                    try {
                        for (int i = 0; i < parameterFiles.size() && equalParameters; i++) {
                            for (int j = 0; j < parameterFiles.size() && equalParameters; j++) {
                                equalParameters = SearchParameters.getIdentificationParameters(parameterFiles.get(i)).equals(SearchParameters.getIdentificationParameters(parameterFiles.get(j)));
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        equalParameters = false;
                    } catch (IOException e) {
                        equalParameters = false;
                    }

                    if (equalParameters) {
                        // all parameters are equal, just select one of them
                        parameterFile = parameterFiles.get(0); // @TODO: can we be more clever in selecting the "right" one?
                    } else {
                        FileSelectionDialog fileSelection = new FileSelectionDialog(parentFrame, parameterFiles, "Select the wanted SearchGUI parameters file.");
                        if (!fileSelection.isCanceled()) {
                            parameterFile = fileSelection.getSelectedFile();
                        }
                    }
                }

                if (parameterFile != null && parameterFile.exists()) {
                    try {
                        searchParameters = SearchParameters.getIdentificationParameters(parameterFile);
                        paramtersTxt.setText(parameterFile.getName());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                validateInput();
            }
        }
    }//GEN-LAST:event_browseOutButtonActionPerformed

    /**
     * Opens a file chooser to select the mgf files.
     *
     * @param evt
     */
    private void browseMgfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseMgfButtonActionPerformed

        JFileChooser fileChooser = new JFileChooser(lastSelectedFolder);
        fileChooser.setDialogTitle("Select Identification File");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setMultiSelectionEnabled(true);

        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File myFile) {

                return myFile.getName().toLowerCase().endsWith(".mgf")
                        || myFile.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Supported formats: Mascot Generic Format (.mgf)";
            }
        };

        fileChooser.setFileFilter(filter);

        int returnVal = fileChooser.showDialog(this, "OK");

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File[] selectedFiles = fileChooser.getSelectedFiles();
            for (File selectedFile : selectedFiles) {
                if (selectedFile.exists()) {
                    mgfFiles.add(selectedFile);
                    lastSelectedFolder = selectedFile.getParent();
                }

            }
            mgfTxt.setText(mgfFiles.size() + " file(s) selected.");
            validateInput();
        }
    }//GEN-LAST:event_browseMgfButtonActionPerformed

    /**
     * Opens a file chooser to select the parameter file.
     *
     * @param evt
     */
    private void browseParametersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseParametersButtonActionPerformed

        File selectedFile = Util.getUserSelectedFile(this, ".par", "DeNovoGUI settings (.par)", "Select Settings File", lastSelectedFolder, true);

        if (selectedFile != null) {
            File tempParamtersFile = selectedFile;
            try {
                searchParameters = SearchParameters.getIdentificationParameters(tempParamtersFile);
                lastSelectedFolder = tempParamtersFile.getParent();
                paramtersTxt.setText(tempParamtersFile.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            validateInput();
        }
    }//GEN-LAST:event_browseParametersButtonActionPerformed

    /**
     * Cancel the opening and close the dialog.
     *
     * @param evt
     */
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        canceled = true;
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * Close the dialog and open the results.
     *
     * @param evt
     */
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        canceled = false;
        dispose();
    }//GEN-LAST:event_okButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton browseMgfButton;
    private javax.swing.JButton browseOutButton;
    private javax.swing.JButton browseParametersButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField mgfTxt;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField outTxt;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JTextField paramtersTxt;
    private javax.swing.JLabel resultsLabel;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JLabel spectraLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * Validate the input and enable of disable the OK button.
     */
    private void validateInput() {
        if (outTxt.getText().length() > 0
                && mgfTxt.getText().length() > 0
                && paramtersTxt.getText().length() > 0) {
            okButton.setEnabled(true);
        } else {
            okButton.setEnabled(false);
        }
    }
}