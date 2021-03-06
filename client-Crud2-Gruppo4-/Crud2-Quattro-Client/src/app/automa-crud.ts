import { UiAutomabileCrud } from "./ui-automabile-crud";

module test {
  export class AutomaCrud implements UiAutomabileCrud {

    public _statoAttuale = new AddEvent();
    constructor() {

    }
    vaiStatoRicerca(): void {
      throw new Error("Method not implemented.");
    }
    vaiStatoAggiungi(): void {
      throw new Error("Method not implemented.");
    }
    vaiStatoModifica(): void {
      throw new Error("Method not implemented.");
    }
    vaiStatoVisualizza(): void {
      throw new Error("Method not implemented.");
    }
    vaiStatoRimuovi(): void {
      throw new Error("Method not implemented.");
    }
    public setState(state: State) {
      this.statoAttuale: State;
    }

    public getState(): {
return this.currentState
}
}

export class RicercaSate implements State {

  AutomaP: AutomaCrud;

  constructor(automaCrud: AuromaCrud) {
    this.automaP = automaP

  }
this.next(e: Event): void {
  if(e instanceof AddEvent){
  this.automaP.setState(this.automaP.aggiungiState);
}
  else (e instanceof SelezionaEvent){
  this.automaP.setState(this.automaP.VisualizzaState);

}
  else { console.log("evento inatteso!") }
}
}

export class VisualizzaState implements State {

  utomaP: AuromaCrud;

  constructor(automaCrud: AuromaCrud) {
    this.automaP = automaP;
  }
this.next(e: Event): void {
  if(e instanceof AddEvent){
  this.automaP.setState(this.automaP.AggiungiState);
}

if (e instanceof ModificaEvent) {
  this.automaP.setState(this.automaP.ModificaState);
}

if (e instanceof RimuoviEvent) {
  this.automaP.setState(this.automaP.RimuoviState);
}
if (e instanceof RicercaEvent) {
  this.automaP.setState(this.automaP.RicercaSate);
}
if (e instanceof SelezionaEvent) {
  this.automaP.setState(this.automaP.VisualizzaState);
}
else { console.log("evento inatteso!") }
}
}


export class ModificaState implements State {

  utomaP: AuromaCrud;

  constructor(automaCrud: AuromaCrud) {
    this.automaP = automaP
  }
this.next(e: Event): void {
  if(e instanceof AnnullaEvent){
  this.automaP.setState(this.automaP.VisualizzaState);

  else if (e instanceof ConfermaEvent) {
    this.automaP.setState(this.automaP.VisualizzaState);
  }

  else { console.log("evento inatteso!") }
}
}
export class RimuoviState implements State {

  utomaP: AuromaCrud;

  constructor(automaCrud: AuromaCrud) {
    this.automaP = automaP
  }
this.next(e: Event): void {
  if(e instanceof ConfermaEvent){
  this.automaP.setState(this.automaP.RicercaState);
}

  else if (e instanceof AnnullaEvent) {
  this.automaP.setState(this.automaP.VisualizzaState);
}

else { console.log("evento inatteso!") }
}
}

export class AggiungiState implements State {

  automaP: AuromaCrud;

  constructor(automaCrud: AuromaCrud) {
    this.automaP = automaP
  }
this.next(e: Event): void {
  if(e instanceof AnnullaEvent){
  this.automaP.setState(this.automaP.RicercaSate);
}

  else if (e instanceof ConfermaEvent) {
  this.automaP.setState(this.automaP.VisualizzaState);
}

else { console.log("evento inatteso!") }
}
}
}
