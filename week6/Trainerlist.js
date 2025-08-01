import { Link } from 'react-router-dom';

const TrainerList = ({ data }) => (
  <div>
    <h2>Trainer List</h2>
    <ul>
      {data.map(trainer => (
        <li key={trainer.trainerId}>
          <Link to={`/trainer/${trainer.trainerId}`}>{trainer.name}</Link>
        </li>
      ))}
    </ul>
  </div>
);

export default TrainerList;
