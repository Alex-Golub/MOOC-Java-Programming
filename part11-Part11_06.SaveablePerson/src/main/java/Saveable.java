/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thisPc
 * Jun 22, 2020 10:03:18 PM
 */
public interface Saveable {
  
  void save();
  void delete();
  void load(String address);
  
}
